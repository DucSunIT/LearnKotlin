package com.ducsunit.lesson2

// Cấu trúc ra quyểt định, vòng lặp
/*
* Biểu thức if
* Vòng lập for
* Vòng lặp while
* Vòng lặp lông nhau
* Lệnh break, continue
* */

fun main() {
    val a = 9000
    val b = 300
//    println(findMax(a, b))
//    val max = if (a < b) b else a
//    println(max)
    val gpa = 1.2f
    val result =
        if (gpa >= 3.6f) "Xuất sắc"
        else if (gpa >= 3.2f) "Giỏi"
        else if (gpa >= 2.6f) "Khá"
        else if (gpa > 2.0f) "Trung bình"
        else "Yếu"
    println(result)

}

// if có thể coi như biểu thức hoặc cấu trúc rẽ nhánh
//fun findMax(a: Int, b: Int) = if (a < b) b else a