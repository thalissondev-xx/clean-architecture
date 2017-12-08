package br.com.thalissonestrela.createaccount.presentation.createaccount

import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IPresenter
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IView
import br.com.thalissonestrela.createaccount.domain.createaccount.model.CreateUser
import javax.inject.Inject

class CreateAccountPresenter @Inject constructor(val view: IView): IPresenter {

    override fun createAccount(createUser: CreateUser) {

    }

}