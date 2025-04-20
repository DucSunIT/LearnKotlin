package com.ducsunit.lesson2

// tìm hiểu tổng quát về hàm
// các tham số hàm

fun main() {
//    val sum1 = add(100, 300)
//    println(sum1)
//    val a = 234
//    val b = 235
//    val sum2 = add(a, b)
//    println(sum2)
//    println(add(10, 12))
//
//    drawRectangle(8, 8)

    // nạp chồng hàm
    val sumInt = add(100, 200)
    val sumLong = add(100L, 300L)
    val sumIntLong = add(100, 250L)
    val sumFloat = add(2.3f, 4.5f)
    val sumDouble = add(1.1, 2.2, 8.99)

}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add(a: Long, b: Long): Long {
    return a + b
}

fun add(a: Int, b: Long): Long {
    return a + b
}

fun add(a: Float, b: Float): Float {
    return a + b
}

fun add(a: Double, b: Double): Double {
    return a + b
}

fun add(arr: IntArray): Int {
    var sum = 0
    for (item in arr) {
        sum += item
    }
    return sum
}

fun add(a: Double, b: Double, c: Double): Double {
    return a + b + c
}

fun drawRectangle(width: Int, height: Int) {
    for (i in 1..height) {
        for (j in 1..width) {
            if (i == 1 || i == height || j == 1 || j == width) {
                print(" * ")
            } else {
                print("   ")
            }
        }
        println()
    }
}
// cú pháp tổng quát
/* tên hàm luôn phải thể hiện 1 hành động
*
fun functionName(parameter: Type, parameter2: Type, ...): Type{
    // statement
} // end function
*
* */
