/*
 * Created by Ogabek on 10/22/18 10:53 PM
 */

package startapp.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query

@Dao
interface LugatDao {
    //Here I'm getting DbModel for dictionary to get translation of given a word written with korean letters
    @Query("SELECT * FROM `dictionary` WHERE `w` = :word")
    fun getTranslationForHangul(word: String): LugatDbModel

    //Here I'm searching given word, this query may return several results
    @Query("SELECT * FROM `dictionary` WHERE `w` LIKE :word")
    fun getSuggestionsForHangul(word: String): LugatDbModel

    //I'm doing here the same thing as above, but this time I'm translating the korean word written with english letters
    @Query("SELECT * FROM `dictionary` WHERE `w_r` = :word_roman")
    fun getTranslationForRoman(word_roman: String): LugatDbModel

    //The same thing here with English letters
    @Query("SELECT * FROM `dictionary` WHERE `w` LIKE :word_roman")
    fun getSuggestionsForRoman(word_roman: String)

    //Here I'm getting all the rows from the db, and returning List of them
    @Query("SELECT * FROM `dictionary`")
    fun getAll(): List<LugatDbModel>

    //Here I'm inserting rows to the db from the List
    @Insert(onConflict = REPLACE)
    fun insert(lugatData: List<LugatDbModel>)

    //Here I'm inserting row also, but separate elements
    @Insert(onConflict = REPLACE)
    fun insert(LugatData: LugatDbModel)
}