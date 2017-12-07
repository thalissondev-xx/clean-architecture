package br.com.cleanarchitecture.main.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.cleanarchitecture.R
import br.com.cleanarchitecture.main.domain.MainActivityContract.IView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity(), IView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToCreateAccount.setOnClickListener {

        }
    }

    override fun goToCreateAccount() {

    }

}