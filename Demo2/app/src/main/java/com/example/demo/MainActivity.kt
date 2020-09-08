package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttondangky.setOnClickListener {
            Toast.makeText(this,"abc", Toast.LENGTH_SHORT).show()
        }
        buttondangky.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })
        buttondangnhap.setOnClickListener{
            Toast.makeText(this, "edf" ,Toast.LENGTH_SHORT).show()
        }
        buttondangnhap.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }

        })
        buttonthoat.setOnClickListener{
            Toast.makeText(this, "asd" , Toast.LENGTH_SHORT).show()
        }
        buttonthoat.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }

        })
        }
    }