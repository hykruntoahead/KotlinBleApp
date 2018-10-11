package com.example.heyukun.kotlinbleapp.chapter3

/**
 * @author heyukun
 */

//val 常量(运行时常量 val;编译器常量 const val)
const val FINAL_HELLO_WORLD: String = "HelloWorld"
//var 变量
var helloWorld: String = "HelloWorld"

//类型推导
val FINAL_HELLO_CHINA = "HelloChina"

fun main(args: Array<String>) {
//    helloWorld = "HelloHangzhou"
//
//    println(FINAL_HELLO_CHINA)
//
//    println("hello ${args[0]}")
//
//    checkArgs(args)
//
//    val arg1 = args[0].toInt()
//    val arg2 = args[1].toInt()
//
//    println("$arg1 + $arg2 = ${sum(arg1,arg2)}")
//
//
//    println(int2Long(3))
//
//    println(sum1(1,3))
//    println(sum1.invoke(1,3))

//    for (arg in args) {
//        println(arg)
//    }

//    args.forEach { println(it) }
//    args.forEach(::println)

//    args.forEach ForEach@{
//        if (it == "q") return@ForEach
//        println(it)
//    }
//
//    println("The End")

    println(sum1)
    println(int2Long)
    println(::printUsage is ()-> Unit)

}

fun checkArgs(args: Array<String>) {
    if (args.size < 2) {
        printUsage()
        //退出程序
        System.exit(-1)
    }
}

fun printUsage() {
    println("传入 两个整型参数 譬如:1 2") //(Any) -> Unit
}//()-> Unit

/**
 * 函数 第一种方式
 */
//fun sum(arg1 : Int ,arg2 : Int) : Int{
//    return arg1 + arg2
//}

/**
 * 函数 第二种方式
 */
fun sum(arg1: Int, arg2: Int) = arg1 + arg2

/**
 * 匿名函数
 */
val int2Long = fun(x: Int): Long {
    return x.toLong()
}
//(Int) -> Long

/**
 * lambda表达式
 */

val sum1 = { arg1: Int, arg2: Int ->
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2
}

//(Int,Int)-> Int

val printlnHello = {
    println("Hello")
}
//() -> Unit


