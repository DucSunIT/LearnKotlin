package com.ducsunit.lesson2
// type String
// khi tao ra mot doi tuong string la bat bien khong the thay doi duoc
fun main() {
    val str: String = "Hello World"
//    for( c in str){
//        print("${c.lowercase()} ")
//    }
    val str2 = str.uppercase()
    val str3 = str.lowercase()

    // === so sanh hai doi tuong
    println(str === str2)
    println(str2 === str3)
    println(str === str3)


    // noi chuoi
    val fullName = "Alex\tDuc"
    val age = 21
    val salary = 50_000_000
    println("Full name: $fullName, Age: $age, Salary: $salary")

    val a = 200
    val b = 350
    println("$a + $b = ${a + b}")


}