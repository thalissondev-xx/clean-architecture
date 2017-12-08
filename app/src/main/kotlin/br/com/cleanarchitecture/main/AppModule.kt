package br.com.cleanarchitecture.main

import android.app.Application
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule(val application: Application) {

    @Singleton
    @Provides
    fun provideApplication() = application

    @Singleton
    @Provides
    @Named("Application")
    fun provideApplicationContext() = application.applicationContext

    @Singleton
    @Provides
    @Named("IOScheduler")
    fun provideIOScheduler() = Schedulers.io()

    @Singleton
    @Provides
    @Named("MainScheduler")
    fun provideAndroidScheduler() = AndroidSchedulers.mainThread()

}