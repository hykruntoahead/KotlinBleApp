package com.example.heyukun.kotlinbleapp.chapter2

/**
 * @author hyk
 * 空类型安全  ?可空
 */
fun main(args: Array<String>) {

//    val name1= getName()
//    println(name1?.length)

//    val name :String= getName() ?:return
//    println(name.length)

    val value:String? ="HelloWorld"
    println(value!!.length)
}

// getName():String时 return null 时 编译不通过
fun getName():String?{
    return null
}