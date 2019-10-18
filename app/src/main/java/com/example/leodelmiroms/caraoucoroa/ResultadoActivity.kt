package com.example.leodelmiroms.caraoucoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val caraOuCoroaRandom: Bundle? = intent.extras
        val caraOuCoroaResult = caraOuCoroaRandom?.getInt("caraOuCoroa")

        if (caraOuCoroaResult == 0) {
            caraOuCoroaImageView.setImageResource(R.drawable.moeda_cara)
        } else {
            caraOuCoroaImageView.setImageResource(R.drawable.moeda_coroa)
        }

        buttonVoltar.setOnClickListener {
            finish()
        }
    }
}
