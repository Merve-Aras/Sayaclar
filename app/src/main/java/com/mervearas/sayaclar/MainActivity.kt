package com.mervearas.sayaclar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : CountDownTimer(10000,1000){  //object olarak tanımlanır bunun nedeni OOP'den kaynaklanmaktadır. Abstract olduğu için.

            override fun onFinish() {
                textView.text="Süre Doldu."
            }

            override fun onTick(millisUntilFinished: Long) {
                textView.text="Left: ${millisUntilFinished/1000}"
            }

        }.start()
    }
}