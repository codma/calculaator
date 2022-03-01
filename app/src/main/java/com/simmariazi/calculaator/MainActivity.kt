package com.simmariazi.calculaator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simmariazi.calculaator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnPlus.setOnClickListener {
            if (binding.firstNumber.text == null || binding.secondNumber.text == null) {
                return@setOnClickListener
            }
            if (binding.firstNumber.text.length == 0 || binding.secondNumber.text.length == 0) {
                return@setOnClickListener
            }

            var first = binding.firstNumber.text.toString()
            var second = binding.secondNumber.text.toString()

            var result = addNumber(first.toInt(), second.toInt())
            binding.txtResult.setText("$result")
        }

        binding.btnMinus.setOnClickListener {
            if (binding.firstNumber.text == null || binding.secondNumber.text == null) {
                return@setOnClickListener
            }
            if (binding.firstNumber.text.length == 0 || binding.secondNumber.text.length == 0) {
                return@setOnClickListener
            }

            var first = binding.firstNumber.text.toString()
            var second = binding.secondNumber.text.toString()

            var result = subNumber(first.toInt(), second.toInt())
            binding.txtResult.setText("$result")
        }


    }

    private fun subNumber(a: Int, b: Int): Int {
        return a - b;
    }
    private fun addNumber(a: Int, b: Int): Int {
        return a + b;
    }
}