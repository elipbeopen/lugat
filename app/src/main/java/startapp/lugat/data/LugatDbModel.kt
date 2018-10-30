/*
 * Created by Ogabek on 10/22/18 10:53 PM
 */

package startapp.lugat.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "dictionary")
data class LugatDbModel(
    @PrimaryKey(autoGenerate = true) var id: Int?,
    @ColumnInfo(name = "word") var word: String,
    @ColumnInfo(name = "word_roman") var word_roman: String,
    @ColumnInfo(name = "translation") var translation: String
) {
    constructor(): this(null, "", "", "")
}