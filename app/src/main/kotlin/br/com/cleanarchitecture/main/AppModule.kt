package br.com.cleanarchitecture.main

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named

@Module(includes = [InnerAppModule::class])
abstract class AppModule {

    @Binds
    abstract fun provideContext(application: Application): Context

}

@Module
class InnerAppModule {

    @Provides
    @Named("IOScheduler")
    fun provideIOScheduler(): Scheduler = Schedulers.io()

    @Provides
    @Named("MainScheduler")
    fun provideMainScheduler(): Scheduler = AndroidSchedulers.mainThread()

}