package edu.nextstep.camp.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.nextstep.camp.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var expression = Expression.EMPTY
    private val calculator = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button0.setOnClickListener { addOperand("0") }
        binding.button1.setOnClickListener { addOperand("1") }
        binding.button2.setOnClickListener { addOperand("2") }
        binding.button3.setOnClickListener { addOperand("3") }
        binding.button4.setOnClickListener { addOperand("4") }
        binding.button5.setOnClickListener { addOperand("5") }
        binding.button6.setOnClickListener { addOperand("6") }
        binding.button7.setOnClickListener { addOperand("7") }
        binding.button8.setOnClickListener { addOperand("8") }
        binding.button9.setOnClickListener { addOperand("9") }
        binding.buttonPlus.setOnClickListener { addOperator("+") }
        binding.buttonMinus.setOnClickListener { addOperator("-") }
        binding.buttonMultiply.setOnClickListener { addOperator("*") }
        binding.buttonDivide.setOnClickListener { addOperator("/") }
        binding.buttonEquals.setOnClickListener { calculate() }
    }

    private fun addOperand(rawOperand: String) {
        expression += rawOperand.toInt()
        binding.textView.text = expression.rawExpression
    }

    private fun addOperator(rawOperator: String) {
        expression += rawOperator
        binding.textView.text = expression.rawExpression
    }

    private fun calculate() {
        val result = calculator.calculate(expression.rawExpression)
        binding.textView.text = result.toString()
    }
}
