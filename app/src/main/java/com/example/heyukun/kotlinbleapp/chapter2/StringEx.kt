package com.example.heyukun.kotlinbleapp.chapter2

val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))


fun main(args: Array<String>) {
    // '==' => equals(java); '===' => ==(java)
    println(string == fromChars)
    println(string === fromChars)

    println("output:" + string)

    val arg1: Int = 0
    val arg2: Int = 1
    println("" + arg1 + "+" + arg2 + "=" + (arg1 + arg2))
    println("$arg1+$arg2=${arg1 + arg2}")

    //打印双引号
    val sayHello: String = "Hello \"Trump\""
    println(sayHello)

    //$1000
    val salary: Int = 1000
    println("$$salary")
    //$salary
    println("\$salary")

    val rawString: String = """
        \t a
        \n $salary
        \$ salary
        """
    println(rawString)

    println(rawString.length)

}