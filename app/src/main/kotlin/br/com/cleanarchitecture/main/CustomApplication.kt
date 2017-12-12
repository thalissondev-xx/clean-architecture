package br.com.cleanarchitecture.main

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class CustomApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {

    }
}