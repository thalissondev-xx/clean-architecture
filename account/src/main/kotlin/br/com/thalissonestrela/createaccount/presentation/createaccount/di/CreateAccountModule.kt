package br.com.thalissonestrela.createaccount.presentation.createaccount.di

import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IPresenter
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IView
import br.com.thalissonestrela.createaccount.presentation.createaccount.CreateAccountPresenter
import br.com.thalissonestrela.share.scopes.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class CreateAccountModule(val view: IView) {

    @ActivityScope
    @Provides
    fun providePresenter(presenter: CreateAccountPresenter): IPresenter = presenter

    @ActivityScope
    @Provides
    fun provideView(): IView = view

}