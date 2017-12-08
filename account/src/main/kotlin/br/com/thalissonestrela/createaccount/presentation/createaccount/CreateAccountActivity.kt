package br.com.thalissonestrela.createaccount.presentation.createaccount

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.thalissonestrela.createaccount.R
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IView
import kotlinx.android.synthetic.main.activity_create_account.*

class CreateAccountActivity : AppCompatActivity(), IView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        createAccount.setOnClickListener {
            
        }
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun showSuccess() {

    }

    override fun showError() {

    }

    companion object {
        fun newIntent(context: Context): Intent =
                Intent(context, CreateAccountActivity::class.java)
    }

}
