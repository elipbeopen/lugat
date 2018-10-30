package startapp.lugat.helpers

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import startapp.lugat.data.LugatDbModel
import java.io.InputStream
import java.nio.charset.Charset

class JsonToObjectHelper(_context: Context, _fileName: String){
    private val context = _context
    private val fileName = _fileName

    private fun InputStream.readTextAndClose(charset: Charset = Charsets.UTF_8): String {
        return this.bufferedReader(charset).use { it.readText() }
    }

    private fun getJsonStringFromFile(): String{
        val stream: InputStream = context.assets.open(fileName)
        val json: String = stream.readTextAndClose()
        return json
    }

    fun getListOfObjectsFromJson(): List<LugatDbModel>{
        val gson = Gson()
        val  list: List<LugatDbModel> = gson.fromJson(getJsonStringFromFile(),
                 object: TypeToken<List<LugatDbModel>>() {} .type)
        return list
    }
}