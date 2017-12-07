package br.com.cleanarchitecture.main.presentation.di

import br.com.cleanarchitecture.main.presentation.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(MainActivityModule::class)])
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}