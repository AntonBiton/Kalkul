package com.example.newcalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.newcalk.databinding.ActivitySecondBinding

import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.txtLabel.text = intent.getIntExtra(TOTAL_COUNT, 0).toString()
        binding.txtRnd.text ="mmm"


    }
    companion object{
        const val TOTAL_COUNT = "total_count"
    }

    fun onClkButton(view: View) {
        binding.txtRnd.text = "нажали кнопку"
    }
}