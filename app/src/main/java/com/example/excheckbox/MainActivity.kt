package com.example.excheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Cb_Color.setOnClickListener (this)
    }

    override fun onClick(view: View) {

        if (Cb_Color.isChecked) {
            Iv_Color.setColorFilter(resources.getColor(R.color.live_green))
        } else {
            Iv_Color.setColorFilter(resources.getColor(R.color.black))
        }

    }
}