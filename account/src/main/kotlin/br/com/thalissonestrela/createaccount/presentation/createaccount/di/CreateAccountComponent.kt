package br.com.thalissonestrela.createaccount.presentation.createaccount.di

import br.com.thalissonestrela.createaccount.presentation.createaccount.CreateAccountActivity
import br.com.thalissonestrela.share.scopes.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [(CreateAccountModule::class)])
interface CreateAccountComponent {
    fun inject(activity: CreateAccountActivity)
}