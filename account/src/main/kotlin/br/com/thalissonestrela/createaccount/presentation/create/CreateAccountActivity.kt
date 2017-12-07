package br.com.thalissonestrela.createaccount.presentation.create

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.thalissonestrela.createaccount.R

class CreateAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
    }

    companion object {
        fun newIntent(context: Context): Intent =
                Intent(context, CreateAccountActivity::class.java)
    }

}
