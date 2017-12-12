package br.com.thalissonestrela.createaccount.presentation.createaccount

import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IPresenter
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IView
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class CreateAccountModule {

    @Provides
    fun providePresenter(presenter: CreateAccountPresenter): IPresenter = presenter

    @Provides
    fun provideView(activity: CreateAccountActivity): IView = activity

}