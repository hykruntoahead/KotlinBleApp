package com.example.heyukun.kotlinbleapp.chapter3.p3_2

import java.lang.Exception

fun main(args: Array<String>) {
    val result = try {
        args[0].toInt() / args[1].toInt()
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
    println("result:$result")


}

fun tryTest(args: Array<String>) {
    try {
        val arg1 = args[0].toInt()
        val arg2 = args[1].toInt()
        println("$arg1 + $arg2 = ${sum(arg1, arg2)}")
    } catch (e: NumberFormatException) {
        println("你确定输入的是整数吗?")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("你确定输入的是两个整数?")
    } catch (e: Exception) {
        println("程序出现未知异常:${e.message}")
    } finally {
        println("感谢使用加法计算器!")
    }
}

fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}