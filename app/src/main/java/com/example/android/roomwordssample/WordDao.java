package com.example.android.roomwordssample;

/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

<<<<<<< HEAD:app/src/main/java/com/example/android/roomwordssample/WordDao.java
<<<<<<< HEAD:app/src/main/java/com/example/android/roomwordssample/WordDao.kt
package com.example.android.roomwordssample

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
=======
=======
>>>>>>> parent of 7baf34d... Converting the code to Kotlin:app/src/main/java/com/example/android/roomwordssample/WordDao.kt
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;
<<<<<<< HEAD:app/src/main/java/com/example/android/roomwordssample/WordDao.java
>>>>>>> parent of 7baf34d... Converting the code to Kotlin:app/src/main/java/com/example/android/roomwordssample/WordDao.java
=======
>>>>>>> parent of 7baf34d... Converting the code to Kotlin:app/src/main/java/com/example/android/roomwordssample/WordDao.kt

/**
 * The Room Magic is in this file, where you map a method call to an SQL query.
 *
 * When you are using complex data types, such as Date, you have to also supply type converters.
 * To keep this example basic, no types that require type converters are used.
 * See the documentation at
 * https://developer.android.com/topic/libraries/architecture/room.html#type-converters
 */

@Dao
public interface WordDao {
<<<<<<< HEAD:app/src/main/java/com/example/android/roomwordssample/WordDao.java

<<<<<<< HEAD:app/src/main/java/com/example/android/roomwordssample/WordDao.kt
    // The flow always holds/caches latest version of data. Notifies its observers when the
    // data has changed.
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): Flow<List<Word>>
=======
>>>>>>> parent of 7baf34d... Converting the code to Kotlin:app/src/main/java/com/example/android/roomwordssample/WordDao.kt

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
=======
    // LiveData is a data holder class that can be observed within a given lifecycle.
    // Always holds/caches latest version of data. Notifies its active observers when the
    // data has changed. Since we are getting all the contents of the database,
    // we are notified whenever any of the database contents have changed.
    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAlphabetizedWords();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();
<<<<<<< HEAD:app/src/main/java/com/example/android/roomwordssample/WordDao.java
>>>>>>> parent of 7baf34d... Converting the code to Kotlin:app/src/main/java/com/example/android/roomwordssample/WordDao.java
=======
>>>>>>> parent of 7baf34d... Converting the code to Kotlin:app/src/main/java/com/example/android/roomwordssample/WordDao.kt
}
