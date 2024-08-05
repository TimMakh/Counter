package com.tim.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.tim.myapplication.viewmodel.CounterViewModel

class MainActivity : ComponentActivity() {

    private val counterViewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)

        textView.text = "${counterViewModel.counter}"

        buttonPlus.setOnClickListener {
            counterViewModel.counter++
            textView.text = "${counterViewModel.counter}"
        }

        buttonMinus.setOnClickListener {
            counterViewModel.counter--
            textView.text = "${counterViewModel.counter}"
        }
    }
}
