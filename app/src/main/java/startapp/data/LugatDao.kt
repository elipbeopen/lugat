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

    @Query("SELECT * FROM `lugatData`")
    fun getAll(): List<LugatData>

    @Insert(onConflict = REPLACE)
    fun insert(lugatData: LugatData)

    @Query("DELETE FROM `lugatData`")
    fun deleteAll()
}