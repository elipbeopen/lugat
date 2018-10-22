/*
 * Created by Ogabek on 10/22/18 10:53 PM
 */

package startapp.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "lugatData")
data class LugatData(@PrimaryKey(autoGenerate = true) var id: Int?,
                     @ColumnInfo(name = "w") var word: String,
                     @ColumnInfo(name = "w_r") var word_roman: String,
                     @ColumnInfo(name = "tr") var translation: String
){
    constructor():this(null, "","", "")
}