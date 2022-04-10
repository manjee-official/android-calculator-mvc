package edu.nextstep.camp.calculator

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class ExpressionTest {

    //TODO 해당 데이터들 테스트가 다 돌아감
    // {0} 뜻은 함수 파라미터 몇번째걸 보여줄건지
//    @ValueSource(strings = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"])
//    @ParameterizedTest(name = "{0}버튼을 누르면 0~9가 보여야 한다")
//    fun test1(expected: String) {
//        // given
//        val expression = Expression(expected)
//
//        // when
//        val actual = expression.rawExpression
//
//        // then
//        assertThat(actual).isEqualsTo(expected)
//    }

    // 입력된 피연산자가 있을 때, 기존 숫자 뒤에 해당 숫자가 화면에 보여야 한다.
    // @TEST
    // @DisplayName("8이 입력 되어 있을 때 9를 입력하면 89가 되어야한다")
//    internal fun test2() {
//        // given
//        var expression = Expression("8")
//
//        // when
//        expression += 9
//        val actual = expression.rawExpression
//
//        // then
//        assertThat(actual).isEqualTo("89")
//    }

    // 입력된 피연산자가 있을 때, 기존 숫자 뒤에 해당 숫자가 화면에 보여야 한다.
    // @TEST
    // @DisplayName("1이 입력 되어 있을 때 2를 입력하면 12가 되어야한다")
//    internal fun test2() {
//        // given
//        var expression = Expression("1")
//
//        // when
//        expression += 2
//        val actual = expression.rawExpression
//
//        // then
//        assertThat(actual).isEqualTo("89")
//    }

    // 입력된 피연산자가 없을 때, 사용자가 연산자 +, -, *, / 버튼을 누르면 화면에 아무런 변화가 없어야한다
//    @ValueSource(strings = ["+", "-", "*", "/"])
//    @ParameterizedTest("비어있을 때, {0} 연산자가 추가되면 비어있어야 한다")
//    fun test4(rawOperator: String) {
//        // given
//        var expression = Expression.EMPTY
//
//        // when
//        expression += rawOperator
//        val actual = expression
//
//        // then
//        assertThat(actual).isEqualTo(Expression.EMPTY)
//    }

//    @CsvSource(
//        "1, +, 1 +",
//        "3, -, 3 -",
//        "35, *, 35 *",
//        "33, /, 33 /"
//    )
//    @ParameterizedTest(name = "{0}이 있을 때, 연산자 {0}을 추가하면 3 {0}이 되어야 한다")
//    internal fun test5(rawExpression: String, rawOperator: String, expected: String) {
//        // given
//        var expression = Expression(rawExpression)
//
//        // when
//        expression += rawOperator
//        val actual: String? = expression.rawExpression
//
//        // then
//        assertThat(actual).isEqualTo(expected)
//    }

//    @Test
//    @DisplayName("비어있을 때, 마지막을 제거하면 비어있어야 한다")
//    internal fun test6() {
//        // given
//        val expression = Expression.EMPTY
//
//        // when
//        val actual = expression.dropLast()
//
//        // then
//        assertThat(actual).isEqualTo(Expression.EMPTY)
//    }

    //    @CsvSource(
//        "13,1"
//        "22 +,22"
//        "32,3"
//    )
//    @ParameterizedTest(name = "{0} 일 때, 마지막을 제거하면 {1} 이어야 한다")
//    internal fun test7(rawExpression: String, expected: String) {
//        // given
//        val expression = Expression(rawExpression)
//
//        // when
//        val actual = expression.dropLast().rawExpression
//
//        // then
//        assertThat(actual).isEqualTo(expected)
//    }

//    @Test
//    @DisplayName("1일 때, 마지막을 제거하면 수식은 비어있어야 한다")
//    internal fun test8() {
//        // given
//        val expression = Expression("1")
//
//        // when
//        val actual = expression.dropLast()
//
//        // then
//        assertThat(actual).isEqualTo(Expression.EMPTY)
//    }
}