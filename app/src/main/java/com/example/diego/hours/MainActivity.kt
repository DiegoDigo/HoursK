package com.example.diego.hours

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onClick(view: View?) {

        msg.text = "Mudado"
    }



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        msg.text = "funcionando"
        msg.textSize = 30f
        button.setOnClickListener(this)
    }
}
