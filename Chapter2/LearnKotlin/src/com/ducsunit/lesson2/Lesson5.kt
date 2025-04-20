package com.ducsunit.lesson2

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
//    numbers[0] = 100 // call method set
    val x = numbers[1] // call method get
//    println(x)
//    for(item in numbers){
//        print("$item ")
//    }
    val k = 2
    val n = 5

//    for(index in k..n){
//        println("$index : ${numbers[index]}")
//    }
//    for(index in 0..numbers.lastIndex) {
//        println("$index : ${numbers[index]}")
//    }

    val friends = arrayOf("Peter", "Alex", "Adam", "Mie")
//    for(index in 0..friends.lastIndex){
//        println("$index : ${friends[index]}")
//    }
    val integers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val floats = floatArrayOf(12.36f, 3.4f, 5.6f, 8.8f)
    val longs = longArrayOf(1, 2, 3, 4, 5, 6, 6, 7, 8, 9)
// tao mang rong, chua toi da 100 phan tu, gia tri mac dinh = 0
    val integers100 = IntArray(100) { -1 } // tao mang rong gan gia tri mac dinh = -1
//    for(item in integers100){
//        print("$item ")
//    }
// tao mang rong, chua toi da 100 phan tu, gia tri mac dinh = false
    val booleans = BooleanArray(100) { false } // tao mang rong gan gia tri mac dinh = false
//    for (item in booleans) {
//        print("$item ")
//    }

    // tao mang gia tri gap 2 -> it tu hieu la chi so
    val intergers2 = IntArray(20) {it * 2} // <-> index * 2 = gia tri phan tu cua mang
    for (item in intergers2){
        print("$item ")
    }
}