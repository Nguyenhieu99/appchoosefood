package com.example.math

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncong.setOnClickListener {
            var sothu1 : Int = (edittextthunhat.text.toString()).toInt()
            var sothu2 : Int = (edittextthuhai.text.toString()).toInt()
            var ketqua : Int = sothu1 + sothu2
            textviewketqua.text = ketqua.toString()
        }
        buttontru.setOnClickListener {
            var sothu1 : Int = (edittextthunhat.text.toString()).toInt()
            var sothu2 : Int = (edittextthuhai.text.toString()).toInt()
            var ketqua : Int = sothu1 - sothu2
            textviewketqua.text = ketqua.toString()
        }
        buttonnhan.setOnClickListener {
            var sothu1 : Int = (edittextthunhat.text.toString()).toInt()
            var sothu2 : Int = (edittextthuhai.text.toString()).toInt()
            var ketqua : Int = sothu1 * sothu2
            textviewketqua.text = ketqua.toString()
        }
        buttonchia.setOnClickListener {
            var sothu1 : Int = (edittextthunhat.text.toString()).toInt()
            var sothu2 : Int = (edittextthuhai.text.toString()).toInt()
            var ketqua : Int = sothu1 / sothu2
            textviewketqua.text = ketqua.toString()
        }
    }
}