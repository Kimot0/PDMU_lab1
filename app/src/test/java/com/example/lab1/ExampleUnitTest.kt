package com.example.lab1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun firstMaxTest() {
        assertEquals(5, MaxMinJava.max(1,5))
    }
    @Test
    fun secondMaxTest() {
        assertEquals(120, MaxMinJava.max(120,119))
    }
    @Test
    fun thirdMaxTest() {
        assertEquals(17, MaxMinJava.max(17,5))
    }
    @Test
    fun fourthMaxTest() {
        assertEquals(1, MaxMinJava.max(1,0))
    }
    @Test
    fun firstMinTest() {
        assertEquals(1, MaxMinJava.min(1,5))
    }
    @Test
    fun secondMinTest() {
        assertEquals(119, MaxMinJava.min(120,119))
    }
    @Test
    fun thirdMinTest(){
        assertEquals(5, MaxMinJava.min(17,5))
    }
    @Test
    fun fourthMinTest() {
        assertEquals(0, MaxMinJava.min(1,0))
    }

}