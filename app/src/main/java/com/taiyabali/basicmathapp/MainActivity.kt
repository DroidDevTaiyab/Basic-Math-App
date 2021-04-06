package com.taiyabali.basicmathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.taiyabali.basicmathapp.databinding.ActivityMainBinding
import java.lang.NumberFormatException
import kotlin.math.*

/**
 * Created by Techpass Master on 26-March-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var result: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // fun for handle buttons
        onButtonClick()

    }

    private fun onButtonClick() {

        with(binding) {

            //  sum
            btnSum.setOnClickListener {

                try {
                    result = (getInput1() + getInput2()).toString()
                    txtResult.text = ("sum: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  sub
            btnSub.setOnClickListener {

                try {
                    result = (getInput1() - getInput2()).toString()
                    txtResult.text = ("sub: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  multiply
            btnMultiply.setOnClickListener {

                try {
                    result = (getInput1() * getInput2()).toString()
                    txtResult.text = ("multiply: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  divide
            btnDivide.setOnClickListener {

                try {
                    result = (getInput1() / getInput2()).toString()
                    txtResult.text = ("divide: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  sin
            btnSin.setOnClickListener {

                try {
                    result = sin(getInput1().toDouble()).toString()
                    txtResult.text = ("sin: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            // cos
            btnCos.setOnClickListener {

                try {
                    result = cos(getInput1().toDouble()).toString()
                    txtResult.text = ("cos: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  tan
            btnTan.setOnClickListener {

                try {
                    result = tan(getInput1().toDouble()).toString()
                    txtResult.text = ("tan: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  root
            btnRoot.setOnClickListener {

                try {
                    result = sqrt(getInput1().toDouble()).toString()
                    txtResult.text = ("root: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  square
            btnPower2.setOnClickListener {

                try {
                    result = getInput1().toDouble().pow(2.0).toString()
                    txtResult.text = ("square: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  cubic
            btnPower3.setOnClickListener {

                try {
                    result = getInput1().toDouble().pow(3.0).toString()
                    txtResult.text = ("cubic: $result")
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    // oneLine fun for getting first value from EditText
    private fun getInput1(): Int = Integer.parseInt(binding.editText1.text.toString())

    // oneLine fun for getting second value from EditText
    private fun getInput2(): Int = Integer.parseInt(binding.editText2.text.toString())
}