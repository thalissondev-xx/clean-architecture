package br.com.thalissonestrela.createaccount.presentation.createaccount

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.thalissonestrela.createaccount.R
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IPresenter
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract.IView
import br.com.thalissonestrela.createaccount.domain.createaccount.model.CreateUser
import kotlinx.android.synthetic.main.activity_create_account.*
import javax.inject.Inject

class CreateAccountActivity : AppCompatActivity(), IView {

    @Inject
    lateinit var presenter: IPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        createAccount.setOnClickListener {
            presenter.createAccount(getUserForCreate())
        }
    }

    private fun getUserForCreate()
        = CreateUser(
            firstName = firstName.text.toString(),
            lastName = lastName.text.toString(),
            password = password.text.toString())

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
