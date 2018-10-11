package com.example.heyukun.kotlinbleapp.chapter2.typecast

fun main(args: Array<String>) {
//    val parent :Parent = Child()
//    if (parent is Child){
//        //智能类型转换
//        println(parent.name)
//    }
//
//    val string:String? = "Hello"
//    if (string is String)
//        println(string.length)

    val parent : Parent = Parent()
    // ClassCastException
    // val child :Child = parent as Child

    //安全类型转换
    val child :Child? = parent as? Child
    println(child)


}