/*
 *   Copyright 2020 Leon Latsch
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package dev.leonlatsch.photok.model.database.dao

import androidx.room.*
import dev.leonlatsch.photok.model.database.entity.Password

/**
 * Data Access Object for [Password] Entity.
 *
 * @since 1.0.0
 * @author Leon Latsch
 */
@Dao
interface PasswordDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(password: Password)

    @Delete
    suspend fun delete(password: Password)

    @Update
    suspend fun update(password: Password)

    /**
     * Load the only password with id = 0
     */
    @Query("SELECT * FROM password WHERE id = 0")
    suspend fun getPassword(): Password?
}