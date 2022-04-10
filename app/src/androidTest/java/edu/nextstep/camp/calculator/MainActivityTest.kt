package edu.nextstep.camp.calculator

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun givenCompleteExpression_whenEqualsClicked_thenResultDisplayed() {
        // given: "1 + 2 * 3"일 떼
        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.buttonPlus)).perform(click())
        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.buttonMultiply)).perform(click())
        onView(withId(R.id.button3)).perform(click())

        // when: 사용자가 = 버튼을 누르면
        onView(withId(R.id.textView)).perform(click())

        // then: 수식의 결과가 화면에 보여야 한다.
        onView(withId(R.id.textView)).check(matches(withText("6")))
    }
}