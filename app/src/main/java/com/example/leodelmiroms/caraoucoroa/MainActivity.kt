package com.example.leodelmiroms.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

private var caraOuCoroaRandom = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonJogar.setOnClickListener {

            caraOuCoroaRandom = Random.nextInt(2)

            val resultActivity = Intent(this, ResultadoActivity::class.java).apply{
            putExtra("caraOuCoroa", caraOuCoroaRandom)
        }
            startActivity(resultActivity)
        }

    }
}
