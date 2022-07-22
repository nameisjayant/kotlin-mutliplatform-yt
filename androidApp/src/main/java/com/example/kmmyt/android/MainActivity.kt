package com.example.kmmyt.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kmmyt.Greeting
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.example.kmm.android.ui.KMMTheme

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KMMTheme {
                Text(greet())
            }
        }
    }
}
