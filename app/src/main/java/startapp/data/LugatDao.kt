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

    @Query("SELECT * FROM `dictionary`")
    fun getAll(): List<LugatDbModel>

    @Insert(onConflict = REPLACE)
    fun insert(lugatData: MutableList<LugatDbModel>)

}