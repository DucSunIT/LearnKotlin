package com.ducsunit.lesson2

import kotlin.math.sqrt

// Kiểm tra và ép kiểu
// --> Toán tử is
// --> Ép kiểu thông minh
// Ép kiểu không an toàn
// Ép kiểu an toàn


fun main() {
    val obj = "Hello World"
    val number = 100
    val gpa = 3.6f
//    checkStringType(gpa)

    /*Ép kiểu không an toàn --> as */
    // Ép kiểu an toàn ?
    val squareRoot:Int? = sqrt(number.toDouble()) as? Int
    println(squareRoot)
}
/*Ép kiểu thông minh*/
// Any: Là kiểu dữ liệu cha của tất cả các kiểu dữ liệu trong Kotlin
fun checkStringType(obj: Any) {
    if (obj is String) {
        println("Đối tượng obj là kiểu String. Độ dài chuỗi: ${obj.length}")
        println(obj.uppercase())
        println(obj.lowercase())
        println(obj.get(0))
    } else {
        println("Đối tượng obj không phải là kiểu String.")
    }
}

fun isNullOrEmpty(obj: Any) {
    if (obj is String && obj.length == 0) {
        //
    }
}

fun doPrint(obj: Any) {
    when (obj) {
        is Int -> println(obj + 100)
        is String -> println(obj.length)
        is IntArray -> println(obj.sum()) // tính tổng phần tử trong mảng
    }
}



