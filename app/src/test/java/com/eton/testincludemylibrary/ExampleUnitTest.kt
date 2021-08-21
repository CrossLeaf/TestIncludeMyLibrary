package com.eton.testincludemylibrary

import com.eton.base_module.TestClass
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
        val a = TestClass().add(1,2)
        assertEquals(a, 3)
    }
}