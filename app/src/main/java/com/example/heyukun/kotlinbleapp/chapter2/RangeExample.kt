package com.example.heyukun.kotlinbleapp.chapter2

/**
 * 区间:range
 * 表示范围
 * CloseRange的子类,IntRange最常用
 */
val range:IntRange = 0..1024//[0,1024]
val range_exclusive :IntRange =0 until 1024 //[0,1024) => [0,1023]

val emptyRange:IntRange = 0..-1

fun main(args: Array<String>) {
    println(emptyRange.isEmpty())

    println(range.contains(50))
    println(50 in range)

    for (i in range_exclusive){
        println("$i,")
    }

}


