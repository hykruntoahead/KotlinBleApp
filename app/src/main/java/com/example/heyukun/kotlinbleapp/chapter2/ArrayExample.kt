package com.example.heyukun.kotlinbleapp.chapter2

import com.example.heyukun.kotlinbleapp.chapter2.typecast.Child

/**
 * 数组array
 */
val arrayOfInt : IntArray = intArrayOf(1,3,5,7)
val arrayOfChar : CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val arrayOfString : Array<String> = arrayOf("我","是","程序猿")
val arrayOfChild :Array<Child> = arrayOf(Child(), Child())

fun main(args: Array<String>) {

    println(arrayOfInt.size)

    for (a in arrayOfInt){
        println(a)
    }

    println(arrayOfChar[2])

    println(arrayOfString[1])
    arrayOfString[1] = "不是"
    println(arrayOfString[1])


    println(arrayOfChar.joinToString())

    //切片
    println(arrayOfInt.slice(1..2))
}