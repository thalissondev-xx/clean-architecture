package br.com.cleanarchitecture.main.domain

interface MainActivityContract {

    interface IView {
        fun goToCreateAccount()
    }

    interface IPresenter {
        fun onUserRequestCreateAccount()
    }

}