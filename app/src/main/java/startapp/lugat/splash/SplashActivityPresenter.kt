package startapp.lugat.splash

class SplashActivityPresenter(_view: SplashActivityContract.MvpView): SplashActivityContract.MvpPresenter{
    val model = SplashActivityModel()
    val view = _view
    override fun start() {
        model.writeFromJsonToDb()
        view.goToMainAcivity()
    }
}