package com.example.heyukun.kotlinbleapp.chapter3.p3_2

/**
 * @author
 * when 类似 java中的 switch
 * 加强版switch
 */
fun main(args: Array<String>) {
    val x = 5
    when(x){
        is Int -> println("Hello $x")
        in 1..100 -> println(" $x is in 1..100")
        !in 1..100 -> println(" $x is not in 1..100")
        args[0].toInt() -> println("x == args[0]")
    }


    //when表达式
    val mode = when{
        args.isNotEmpty() && args[0] == "1" -> 1
        //default
        else -> 0
    }

    println("mode:$mode")

}