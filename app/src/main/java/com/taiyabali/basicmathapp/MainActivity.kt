package com.taiyabali.basicmathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.taiyabali.basicmathapp.databinding.ActivityMainBinding
import java.lang.NumberFormatException
import kotlin.math.*

/**
 * Created by Techpass Master.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // fun for handle buttons
        onButtonClick()

    }

    private fun onButtonClick() {

        with(binding) {

            // create lambda fun
            // 1- val sum = ::sum()
            // 2- click on yellow bulb and add this@MainActivity
            // 3- again click on yellow bulb and add select convert ref. to lambda

            //  sum
            btnSum.setOnClickListener {
                try {
                    val sum = { a: Int, b: Int -> this@MainActivity.sum(a, b) }
                    tvResult.text = ("Sum: " + sum(getInput1(), getInput2()))
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  sub
            btnSub.setOnClickListener {
                try {
                    val sub = { a: Int, b: Int -> this@MainActivity.sub(a, b) }
                    tvResult.text = ("Sub: " + sub(getInput1(), getInput2()))
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  multiply
            btnMultiply.setOnClickListener {
                try {
                    val multi = { a: Int, b: Int -> this@MainActivity.multi(a, b) }
                    tvResult.text = ("Multiply: " + multi(getInput1(), getInput2()))
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  divide
            btnDivide.setOnClickListener {
                try {
                    val divide = { a: Double, b: Double -> this@MainActivity.divide(a, b) }
                    tvResult.text = ("Divide: " + divide(getInput1().toDouble(), getInput2().toDouble()))
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }

            }

            //  sin
            btnSin.setOnClickListener {
                try {
                    val sin = { a: Double -> this@MainActivity.sinNumber(a) }
                    tvResult.text = ("sin: " + sin(getInput1().toDouble()))
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }

            }

            // cos
            btnCos.setOnClickListener {
                try {
                    val cos = { a: Double -> this@MainActivity.cosNumber(a) }
                    tvResult.text = ("cos: " + cos(getInput1().toDouble()))
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  tan
            btnTan.setOnClickListener {
                try {
                    val tan = { a: Double -> this@MainActivity.tanNumber(a) }
                    tvResult.text = ("cos: " + tan(getInput1().toDouble()))
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  root
            btnRoot.setOnClickListener {
                try {
                    val root = { a: Double -> this@MainActivity.root(a) }
                    tvResult.text = ("root: " + root(getInput1().toDouble()))
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }
            }

            //  square
            btnPower2.setOnClickListener {
                try {
                    val square = { a: Double -> this@MainActivity.square(a) }
                    tvResult.text = ("square: " + square(getInput1().toDouble().pow(2.0)))
                } catch (nfe: NumberFormatException) {
                    Toast.makeText(this@MainActivity, "Wrong Number Format", Toast.LENGTH_SHORT).show()
                }

            }

            //  cubic
            btnPower3.setOnClickListener {
                try {
                    val cubic = { a: Double -> this@MainActivity.cubic(a) }
                    tvResult.text = ("cubic: " + cubic(getInput1().toDouble().pow(3.0)))
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


    // fun for sum two number
    private fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // fun for sun two number
    private fun sub(a: Int, b: Int): Int {
        return a - b
    }

    // fun for multiply two number
    private fun multi(a: Int, b: Int): Int {
        return a * b
    }

    // fun for divide two number
    private fun divide(a: Double, b: Double): Double {
        return a / b
    }

    // fun for find the sin of a number
    private fun sinNumber(a: Double): Double {
        return sin(a)
    }

    // fun for find the cos of a number
    private fun cosNumber(a: Double): Double {
        return cos(a)
    }

    // fun for find the tan of a number
    private fun tanNumber(a: Double): Double {
        return tan(a)
    }

    // fun for find the root of a number
    private fun root(a: Double): Double {
        return sqrt(a)
    }

    // fun for find the square of a number
    private fun square(a: Double): Double {
        return a
    }

    // fun for find the cubic of a number
    private fun cubic(a: Double): Double {
        return a
    }
}