package br.com.cleanarchitecture.main

import br.com.thalissonestrela.createaccount.presentation.createaccount.di.CreateAccountComponent
import br.com.thalissonestrela.createaccount.presentation.createaccount.di.CreateAccountModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun inject(application: CustomApplication): CustomApplication
    fun plus(createAccountModule: CreateAccountModule): CreateAccountComponent
}