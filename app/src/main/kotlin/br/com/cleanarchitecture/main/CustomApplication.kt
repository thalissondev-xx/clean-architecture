package br.com.cleanarchitecture.main

import android.app.Application
import br.com.thalissonestrela.createaccount.presentation.createaccount.di.CreateAccountComponent
import br.com.thalissonestrela.createaccount.presentation.createaccount.di.CreateAccountComponentCreator
import br.com.thalissonestrela.createaccount.presentation.createaccount.di.CreateAccountModule

class CustomApplication: Application(),
        CreateAccountComponentCreator {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppComponent()
    }

    private fun initAppComponent() {
        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun plus(createAccountModule: CreateAccountModule): CreateAccountComponent
            = appComponent.plus(createAccountModule)

}