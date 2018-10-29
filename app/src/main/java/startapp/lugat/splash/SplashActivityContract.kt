package startapp.lugat.splash

interface SplashActivityContract{
    interface MvpModel{
        fun writeFromJsonToDb()
    }
    interface MvpPresenter{
        fun start()
    }
    interface MvpView{
        fun goToMainAcivity()
    }
}