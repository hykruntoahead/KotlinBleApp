package com.example.heyukun.kotlinbleapp.chapter3.p3_2

/**
 * 运算符
 * -任何类可以定义或者重载父类的基本运算符
 * -通过运算符对应的具体函数来定义
 * -对参数个数作要求，对参数和返回值类型不作要求
 */

class Complex(var real: Double, var imaginary: Double) {

    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    operator fun plus(other: Int): Complex {
        return Complex(real + other, imaginary)
    }

    operator fun plus(other: Double): Int {
        return (real + other).toInt()
    }

    operator fun invoke(): Double {
        return Math.hypot(real, imaginary)
    }

    override fun toString(): String {
        return "$real +${imaginary}i"
    }


}

class Book{
    //infix 中缀表达式
    infix fun on(any: Any):Boolean{
        return any is Desk
    }
}

class Desk

fun main(args: Array<String>) {
//    val c1 = Complex(3.0,4.0) // 3+4i
//    val c2 = Complex(2.0,7.5)//  2+7.5i
//
//    println(c1 + c2)
//    println(c1 + 5)
//    println(c1 + 4.6)
//
//    println(c1())

    //-name <Name>
    if ("-name" in args) {
        println(args[args.indexOf("-name") + 1])
    }

    if(Book() on Desk()){
        println("book on Desk")
    }

}