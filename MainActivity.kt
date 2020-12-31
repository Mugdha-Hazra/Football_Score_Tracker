package com.example.assignmenttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    var noc=0
    var noc2=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goali.setOnClickListener{
            noc+=1
            ut.text="$noc"
        }
        goalii.setOnClickListener{
            noc2+=1
            dt.text="$noc2"
        }
    }
}
