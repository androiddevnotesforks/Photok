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

package dev.leonlatsch.photok.model.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity describing a Password.
 * Always uses 0 for [id] to only have one instance at a time.
 *
 * @since 1.0.0
 * @author Leon Latsch
 */
@Entity(tableName = "password")
data class Password(
    val password: String,
    @PrimaryKey(autoGenerate = false) val id: Int = 0 // Set hard 0 to replace if a dupe happens
)