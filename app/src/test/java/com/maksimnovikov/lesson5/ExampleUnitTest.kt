package com.maksimnovikov.lesson5

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun multiplication_test() {
        assertEquals(4, 2 * 2)
    }

    @Test
    fun increment_test() {
        var b = 2
        assertEquals(3, b++)
    }

    @Test
    fun decrement_test() {
        var a = 2
        assertEquals(1, --a)
    }
}