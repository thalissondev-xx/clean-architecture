package br.com.cleanarchitecture.main.presentation

import br.com.cleanarchitecture.main.domain.MainActivityContract
import br.com.cleanarchitecture.main.domain.MainActivityContract.IPresenter
import br.com.cleanarchitecture.main.domain.MainActivityContract.IView
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(private val view: IView): IPresenter {

    override fun onUserRequestCreateAccount() {
        view.goToCreateAccount()
    }

}