package br.com.cleanarchitecture.main

import br.com.thalissonestrela.createaccount.presentation.createaccount.CreateAccountActivity
import br.com.thalissonestrela.createaccount.presentation.createaccount.di.CreateAccountModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(CreateAccountModule::class)])
    abstract fun bindCreateAccount(): CreateAccountActivity

}