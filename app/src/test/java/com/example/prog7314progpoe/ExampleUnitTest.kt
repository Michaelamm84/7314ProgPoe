package com.example.weather

import org.junit.Assert.assertEquals
import org.junit.Test

class WeatherUtilsTest {

    @Test
    fun testTemperatureConversion() {
        val celsius = 25.0
        val expectedFahrenheit = 77.0
        assertEquals(expectedFahrenheit, WeatherUtils.celsiusToFahrenheit(celsius), 0.01)
    }
}
