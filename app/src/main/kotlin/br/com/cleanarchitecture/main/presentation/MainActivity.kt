package br.com.cleanarchitecture.main.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.cleanarchitecture.R
import br.com.cleanarchitecture.main.domain.MainActivityContract.IPresenter
import br.com.cleanarchitecture.main.domain.MainActivityContract.IView
import br.com.cleanarchitecture.main.presentation.di.DaggerMainActivityComponent
import br.com.cleanarchitecture.main.presentation.di.MainActivityModule
import br.com.thalissonestrela.createaccount.presentation.create.CreateAccountActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity: AppCompatActivity(), IView {

    @Inject
    lateinit var presenter: IPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToCreateAccount.setOnClickListener {
            presenter.onUserRequestCreateAccount()
        }
    }

    private fun inject() {
        DaggerMainActivityComponent
                .builder()
                .mainActivityModule(MainActivityModule(this))
                .build()
                .inject(this)
    }

    override fun goToCreateAccount() {
        startActivity(CreateAccountActivity.newIntent(this))
    }

}