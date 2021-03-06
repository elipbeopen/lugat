/*
 * Created by Ogabek on 10/22/18 10:54 PM
 */

package startapp.lugat.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(LugatDbModel::class), version = 1)
abstract class LugatDatabase : RoomDatabase(){
    abstract fun lugatDao(): LugatDao
}