package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    lateinit var inputText: TextView
//    lateinit var outputText: TextView
//
//
//    lateinit var allClear: Button
//    lateinit var modulus: Button
//    lateinit var divide: Button
////    lateinit var equal: Button
//    lateinit var seven: Button
//    lateinit var eight: Button
//    lateinit var nine: Button
//    lateinit var multiply: Button
//    lateinit var four: Button
//    lateinit var five: Button
//    lateinit var six: Button
//    lateinit var minus: Button
//    lateinit var one: Button
//    lateinit var two: Button
//    lateinit var three: Button
//    lateinit var plus: Button
//    lateinit var zero: Button
//    lateinit var dot: Button
//    lateinit var equal: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



//        inputText = findViewById(R.id.tvInputText)
//        outputText = findViewById(R.id.tvOutputText)
//
//
//        allClear = findViewById(R.id.ivAC)
//        modulus = findViewById(R.id.ivModulus)
//        divide = findViewById(R.id.ivDivide)
//        seven = findViewById(R.id.ivBtn7)
//        eight = findViewById(R.id.ivBtn8)
//        nine = findViewById(R.id.ivBtn9)
//        multiply = findViewById(R.id.ivBtnMultiply)
//        four = findViewById(R.id.ivBtn4)
//        five = findViewById(R.id.ivBtn5)
//        six = findViewById(R.id.ivBtn6)
//        minus = findViewById(R.id.ivBtnMinus)
//        one = findViewById(R.id.ivBtn1)
//        two = findViewById(R.id.ivBtn2)
//        three = findViewById(R.id.ivBtn3)
//        plus = findViewById(R.id.ivBtnPlus)
//        zero = findViewById(R.id.ivBtn0)
//        dot = findViewById(R.id.ivBtnDot)
//        equal = findViewById(R.id.ivBtnEqual)





       binding.ivAC.setOnClickListener {
           binding.tvInputText.text = "0"
           binding.tvOutputText.text = "0"
       }

        binding.ivBtn0.setOnClickListener {
            binding.tvInputText.append("0")
        }
        binding.ivBtn1.setOnClickListener {
            binding.tvInputText.append("1")
        }
        binding.ivBtn2.setOnClickListener {
            binding.tvInputText.append("2")
        }
        binding.ivBtn3.setOnClickListener {
            binding.tvInputText.append("3")
        }
        binding.ivBtn4.setOnClickListener {
            binding.tvInputText.append("4")
        }
        binding.ivBtn5.setOnClickListener {
            binding.tvInputText.append("5")
        }
        binding.ivBtn6.setOnClickListener {
            binding.tvInputText.append("6")
        }
        binding.ivBtn7.setOnClickListener {
            binding.tvInputText.append("7")
        }
        binding.ivBtn8.setOnClickListener {
            binding.tvInputText.append("8")
        }
        binding.ivBtn9.setOnClickListener {
            binding.tvInputText.append("9")
        }


        binding.ivBtnDot.setOnClickListener {
            binding.tvInputText.append(" . ")
        }
        binding.ivBtnMinus.setOnClickListener {
            binding.tvInputText.append(" - ")
        }
        binding.ivBtnPlus.setOnClickListener {
            binding.tvInputText.append(" + ")
        }
        binding.ivModulus.setOnClickListener {
            binding.tvInputText.append(" % ")
        }
        binding.ivBtnMultiply.setOnClickListener {
            binding.tvInputText.append(" * ")
        }
    }
}


