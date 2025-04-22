package com.example.kotlinpractice

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        var i : Int = 10
        var name = "유진"
        print("제 이름은 $name 입니다")
        print("제 이름은" + name + "입니다")
    }


}