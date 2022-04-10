package edu.nextstep.camp.calculator

import org.junit.Before
import org.junit.Test

internal class CalculatorTest {
    private lateinit var calculator: Calculator

    // JUnit4
//    @Before
    // JUnit5
//    @BeforeEach
//    internal fun setUp() {
//        calculator = Calculator()
//    }

//    @Test
//    @DisplayName("1 + 2 = 3 이어야한다")
//    internal fun test1() {
//        // given
//
//        // when
//        val actual = calculator.calculate("1 + 2")
//
//        // then
//        assertThat(actual).isEqualTo(3)
//    }

//    @Test
//    @DisplayName("3 + 2 = 5 이어야한다")
//    internal fun test1() {
//        // given
//
//        // when
//        val actual = calculator.calculate("1 + 2")
//
//        // then
//        assertThat(actual).isEqualTo(5)
//    }

    //@CsvSource(delimiter = '=', value = ["1 + 2=3", "2 + 3=5", "1 + 2 + 3=6"])
//    @ParameterizedTest(name = "3 + 2 = 5 이어야한다")
    // raw 에 1+2가 들어오고 exp 에 3이 들어감
//    internal fun test1(rawExpression: String, expected: Int) {
//        // given
//
//        // when
//        val actual = calculator.calculate(rawExpression)
//
//        // then
//        assertThat(actual).isEqualTo(expected)
//    }
}