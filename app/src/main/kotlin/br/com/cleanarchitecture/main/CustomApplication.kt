package br.com.cleanarchitecture.main

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class CustomApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent
                .builder()
                .application(this)
                .build()

        appComponent.inject(this)
        return appComponent
    }
}