package com.example.weather

object WeatherUtils {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return (celsius * 9 / 5) + 32
    }
}