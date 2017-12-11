package br.com.thalissonestrela.createaccount.presentation.createaccount.di

interface   CreateAccountComponentCreator {
    fun plus(createAccountModule: CreateAccountModule): CreateAccountComponent
}