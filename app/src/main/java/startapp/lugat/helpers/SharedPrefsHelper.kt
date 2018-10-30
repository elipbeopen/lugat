package startapp.lugat.helpers

import android.content.Context
import android.content.SharedPreferences

class SharedPrefsHelper(_context: Context){
    private val context = _context
    private var prefs: SharedPreferences? = null
    private val fileName: String = "preferences"
    private val IS_FIRST_LAUNCH = "is_first_launch"

    init {
        prefs = context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
    }
    fun setFirstLaunch(){
        prefs?.edit()?.putBoolean(IS_FIRST_LAUNCH, false)?.apply()
    }
    fun isFirstLaunch(): Boolean?{
        return prefs?.getBoolean(IS_FIRST_LAUNCH, true)
    }
}