package com.ducsunit.lesson2

// --> type number
// --> type char
// --> type boolean
// --> type unsigned integer
val five = 5L
val fiveBillion = 5_000_000_000
val number: Long = 100
val oneByte: Byte = 1

// Byte, Short, Int, Long -> Integer
// Float, Double -> Floating point

val floatValue: Float = 1.25F
val x = 2.1399453f

val doubleValue: Double = 2.33
val y = 2.341345234567898

// unsigned integer
// UByte, UShort, UInt, ULong
val z: UByte = 1u
val uLongValue = 1UL
fun main() {
//    println(x)
//    println(y)
//
//    val binaryValue = 0b10101000_10110000
//    print(binaryValue)

//    val character: Char = 'a'
//    println("Hello\"World")
//     unicode
////    print("\u21FE")
//    val isPrime: Boolean?
//    isPrime = null

//    val x: Double = 100.23
//    val y: Long = 100
//    val sum = x + y
//
//    println("10 % 3 = ${10 % 3}")
//    println("10.5 % 3 = ${10.5 % 3}")
//    println("10.5 % -3 = ${10.5 % -3}")
//    println("-10.5 % 3 = ${-10.5 % 3}")


//    val x = 1
//    val y = 3
//    println(x / y.toFloat())
    val a = 50
    val b = 65
    println(add(a, b.toFloat()))
}

fun add(a: Int, b: Float): Float{
    return a + b
}

