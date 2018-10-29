/*
 * Created by Ogabek on 10/25/18 2:31 PM
 */

/*
 * Created by Ogabek on 10/24/18 10:59 PM
 */

package startapp.splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import startapp.lugat.MainActivity

class SplashActivity: AppCompatActivity(), SplashActivityContract.MvpView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val presenter = SplashActivityPresenter(this)
        presenter.start()
    }
    override fun goToMainAcivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
