package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val edittextuser = findViewById(R.id.edittextuser) as TextView
//        edittextuser.setOnClickListener{
//            edittextuser.text = "Nhập tên đăng nhập..."
//        }
//        val edittextpassword = findViewById(R.id.edittextpassword) as TextView
//        edittextpassword.setOnClickListener {
//            edittextpassword.text = "Nhập mật khẩu..."
//        }
        val buttondangnhap = findViewById(R.id.buttondangnhap) as Button
        buttondangnhap.setOnClickListener{
            //Toast.makeText(this@MainActivity,"You clicked me.", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
//            val arraynumber : IntArray = intArrayOf(1,2,3)
//              intent.putExtra("data" , "Nguyen Manh Hieu")
//            intent.putExtra("data" , arraynumber)
//            val user:Users = Users("kingarms9xxx" , "05091999" , "Nguyen Manh Hieu")
//            intent.putExtra("data" , user)
            startActivity(intent)
        }
        val buttondangky = findViewById(R.id.buttondangky) as Button
        buttondangky.setOnClickListener {
            //Toast.makeText(this@MainActivity,"You clicked me.", Toast.LENGTH_SHORT).show()
            val intent1: Intent = Intent(this@MainActivity, ThirdActivity::class.java)
            startActivity(intent1)
        }
        val buttonthoat = findViewById(R.id.buttonthoat) as Button
        buttonthoat.setOnClickListener {
            //Toast.makeText(this@MainActivity,"You clicked me.", Toast.LENGTH_SHORT).show()
            val intent2: Intent = Intent(this@MainActivity, FourActivity::class.java)
            startActivity(intent2)
        }
    }
}