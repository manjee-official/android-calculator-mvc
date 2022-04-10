package edu.nextstep.camp.calculator

data class Expression(val rawExpression: String) {
    operator fun plus(operand: Int): Expression {
        if (this == EMPTY) {
            return Expression(operand.toString())
        }

        if (rawExpression.last().toString().isOperator()) {
            "$rawExpression $operand"
        } else {
            rawExpression + operand
        }
        return Expression("$rawExpression $operand")
    }

    operator fun plus(operator: String): Expression {
        if (this == EMPTY) return EMPTY

        // 여기서부터는 비어있지 않음
        return Expression("$rawExpression $operator")
    }

    fun dropLast(): Expression {
        return Expression(rawExpression.dropLast(1).trim())
    }

    private fun String.isOperator(): Boolean = OPERATORS.contains(this)

    companion object {
        val EMPTY = Expression("")
        val OPERATORS = listOf("+", "-", "*", "/")
    }
}