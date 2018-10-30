package startapp.lugat.splash

import android.arch.persistence.room.Room
import android.content.Context
import startapp.lugat.data.LugatDatabase
import startapp.lugat.data.LugatDbModel
import startapp.lugat.helpers.JsonToObjectHelper
import startapp.lugat.helpers.SharedPrefsHelper

class SplashActivityModel(_context: Context): SplashActivityContract.MvpModel {

    private var wordsDatabase: LugatDatabase? = null
    private val context = _context
     override fun readFromJsonToObject(): List<LugatDbModel> {
         val jsonToObjectHelper = JsonToObjectHelper(context, "kor-uzb.json")
         val list = jsonToObjectHelper.getListOfObjectsFromJson()
        return list
    }

    override fun writeFromJsonToDb() {
        val sharedPrefsHelper = SharedPrefsHelper(context)
        if(sharedPrefsHelper.isFirstLaunch() == true) {
            wordsDatabase = Room.databaseBuilder(context, LugatDatabase::class.java,
                    "dictionaryDb").build()
            val dao = wordsDatabase?.lugatDao()
            dao?.insert(readFromJsonToObject())

            sharedPrefsHelper.setFirstLaunch()
        }
    }

}