package edu.nextstep.camp.calculator

class Calculator {
    fun calculate(rawExpression: String): Int {
        val expressionElements = rawExpression.split(" ")
        if (expressionElements.isEmpty()) {
            throw IllegalStateException()
        }

        var result = expressionElements.first().toInt()
        expressionElements.drop(1).windowed(2, 2) { (rawOperator, rawOperand) ->
            result = calculate(result, rawOperator, rawOperand.toInt())
        }

        return result
    }

    private fun calculate(operand1: Int, operator: String, operand2: Int): Int {
        return when (operator) {
            "+" -> operand1 + operand2
            "-" -> operand1 - operand2
            "/" -> operand1 / operand2
            "*" -> operand1 * operand2
            else -> throw IllegalStateException()
        }
    }
}