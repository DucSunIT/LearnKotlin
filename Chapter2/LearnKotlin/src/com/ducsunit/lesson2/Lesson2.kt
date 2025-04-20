package com.ducsunit.lesson2

fun main() {
    println("Hello Kotlin")
    println("Hello Java")

    // variable
    val a = 20 // do not change the value of the variable
    println(a)

    var sum: Int = 0 // can change the value of a variable
    val b = 200
    val c = 300

//    sum = a + b
//    sum = a * 2 +b
    println("The sum of $a + $b + $c = ${a + b + c}")

    // String
    val message: String = "Hello World"
    println(message.uppercase())

    // enter data from keyboard
    println("Enter string: ")
    val input: String = readln()
    println(input.uppercase())
    println(input.length)

}