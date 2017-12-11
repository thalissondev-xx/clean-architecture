package br.com.thalissonestrela.createaccount.presentation.createaccount

import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IPresenter
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IView
import br.com.thalissonestrela.createaccount.domain.createaccount.model.CreateUser
import io.reactivex.Scheduler
import javax.inject.Inject
import javax.inject.Named

class CreateAccountPresenter @Inject constructor(
        val view: IView,
        @Named("IOScheduler") val ioScheduler: Scheduler,
        @Named("MainScheduler") val mainScheduler: Scheduler): IPresenter {

    override fun createAccount(createUser: CreateUser) {

    }

}