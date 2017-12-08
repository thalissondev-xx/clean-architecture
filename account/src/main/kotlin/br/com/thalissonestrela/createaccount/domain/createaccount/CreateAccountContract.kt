package br.com.thalissonestrela.createaccount.domain.createaccount

import br.com.thalissonestrela.createaccount.domain.createaccount.model.CreateUser

interface CreateAccountContract {

    interface IView {
        fun showLoading()
        fun hideLoading()
        fun showSuccess()
        fun showError()
    }

    interface IPresenter {
        fun createAccount(createUser: CreateUser)
    }

}