package br.com.cleanarchitecture.main.presentation.di

import br.com.cleanarchitecture.main.domain.MainActivityContract.IPresenter
import br.com.cleanarchitecture.main.domain.MainActivityContract.IView
import br.com.cleanarchitecture.main.presentation.MainActivityPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainActivityModule(private val view: IView) {

    @Singleton
    @Provides
    fun providePresenter(presenter: MainActivityPresenter): IPresenter = presenter

    @Singleton
    @Provides
    fun provideView(): IView = view

}