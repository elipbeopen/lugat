/*
 * Created by Ogabek on 10/24/18 10:59 PM
 */

package startapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import startapp.lugat.MainActivity

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }


}