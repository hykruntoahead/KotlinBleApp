package com.example.heyukun.kotlinbleapp.chapter2

import java.util.logging.SocketHandler

/**
 * @author heyukun
 * 基本数据类型
 */

//bool
val aBoolean: Boolean = true
val otherBoolean: Boolean = false

// int
val anInt:Int = 8
val anotherInt : Int = 0xFF
val moreInt : Int = 0b00000011
val minInt : Int = Int.MIN_VALUE
val maxInt : Int = Int.MAX_VALUE

//long
val aLong : Long = 1221321342343434343
val anotherLong : Long = 123
val maxLong : Long = Long.MAX_VALUE
val minLong : Long = Long.MIN_VALUE


//Float
val aFloat:Float = 4.0f
val anotherFloat:Float = 1E3f
val maxFloat: Float = Float.MAX_VALUE
val minFloat:Float = Float.MIN_VALUE//最小的正数
val realMinFloat : Float = - Float.MAX_VALUE

//Double
val aDouble:Double = 5.0
val anotherDouble:Double = 3.1415926
val maxDouble: Double = Double.MAX_VALUE
val minDouble:Double = Double.MIN_VALUE//最小的正数
val realMinDouble : Double = - Double.MAX_VALUE

//Short
val aShort :Short = 127
val maxShort:Short = Short.MAX_VALUE
val minShort:Short = Short.MIN_VALUE

//byte(-128 ~127)
val abyte:Byte =120 //128error
val maxByte : Byte = Byte.MAX_VALUE
val minByte : Byte = Byte.MIN_VALUE


fun main(args :Array<String>){

    println("======================int====================")
    println(anInt)
    println(anotherInt)
    println(moreInt)


    println(maxInt)
    println(Math.pow(2.0,31.0) -1)

    println(minInt)
    println(-Math.pow(2.0,31.0))

    println("======================long====================")
    println(aLong)
    println(anotherLong)

    println(maxLong)
    println(Math.pow(2.0,63.0) -1)
    println(minLong)
    println(-Math.pow(2.0,63.0))

    println("======================float====================")
    println(aFloat)
    println(anotherFloat)
    println(maxFloat)
    println(minFloat)
    println(realMinFloat)

    //NAN
    println(0.0f/0.0f)
    println(Float.NaN)
    println("==============double============================")

    println(aDouble)
    println(anotherDouble)
    println(maxDouble)
    println(minDouble)
    println(realMinDouble)
    //Double.NAN
    println(0.0/0.0)
    println(Double.NaN)

    println("======================short====================")
    println(aShort)
    println(maxShort)
    println(minShort)


    println("======================byte====================")
    println(abyte)
    println(maxByte)
    println(minByte)


}


