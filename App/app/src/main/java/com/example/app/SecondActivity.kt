package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var arraymonan : ArrayList<MonAn> = ArrayList()
        arraymonan.add(MonAn("Bò Mỹ Ốp La",R.drawable.boopla))
        arraymonan.add(MonAn("Cơm trộn Hàn Quốc",R.drawable.contronhanquoc))
        arraymonan.add(MonAn("Mì xào hải sản",R.drawable.mixaohaisan))
        arraymonan.add(MonAn("Thịt Kho Tàu",R.drawable.thitkhotau))
        arraymonan.add(MonAn("Tôm hùm luộc bia",R.drawable.tomhumluocbia))
        arraymonan.add(MonAn("pizza",R.drawable.pizza))
        listviewmonan.adapter = CustomAdapter(this,arraymonan)
//        val intent = intent
        //val name: String? = intent.getStringExtra("data")
//        val mangso: IntArray? = intent.getIntArrayExtra("data")
//        textviewok.text = mangso?.get(1).toString()
//        val users: Users = intent.getSerializableExtra("data") as Users
        //textviewok.text = users.name + " - " + users.user + " - " + users.pasword

    }
}