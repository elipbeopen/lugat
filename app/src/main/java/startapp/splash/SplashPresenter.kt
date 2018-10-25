/*
 * Created by Ogabek on 10/25/18 2:32 PM
 */

package startapp.splash

class SplashPresenter(private val view: SplashView) {

    fun writeFromJsonToDb() {
        view.goToMainActivity()
    }
}