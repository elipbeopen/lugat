package startapp.lugat.splash

import android.content.Context
import android.os.AsyncTask

class SplashActivityPresenter(context: Context,_view: SplashActivityContract.MvpView): SplashActivityContract.MvpPresenter{
    private val model = SplashActivityModel(context)
    val view = _view
    override fun start() {
        AsyncTask.execute({
            model.writeFromJsonToDb()
            view.goToMainAcivity()
        })
    }
}