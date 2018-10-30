package startapp.lugat.splash

import startapp.lugat.data.LugatDbModel

interface SplashActivityContract{
    interface MvpModel{
        fun writeFromJsonToDb()
        fun readFromJsonToObject(): List<LugatDbModel>
    }
    interface MvpPresenter{
        fun start()
    }
    interface MvpView{
        fun goToMainAcivity()
    }
}