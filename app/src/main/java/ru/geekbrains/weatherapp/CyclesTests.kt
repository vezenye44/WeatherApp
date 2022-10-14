package ru.geekbrains.weatherapp



fun main() {
    println("________")
    for (day in Weekday.values()) {
        println(day.name)
    }
    println("________")
    repeat(Weekday.values().size) {
        println("${Weekday.values()[it]}")
    }
    println("________")
    Weekday.values().forEach {
        println("${it.name}")
    }
    println("________")
    var it = Weekday.values().size
    while (--it >= 0) {
        println("${Weekday.values()[it]}")
    }
    println("--------")
}