package com.example.heyukun.kotlinbleapp.chapter3.p3_2
class X
/**
 * 属性初始化
 * -尽量在构造方法中完成
 * -无法在构造函数方法中初始化，尝试降级为局部变量
 * -var 用 lateinit 延迟初始化，val 用lazy
 * -可空类型谨慎用null 初始化
 */
class A{
    var b  = 0
    lateinit var c :String
    lateinit var d:X
    val e:X by lazy {
        println("init X")
        X()
    }

    var cc:String? = null

//    protected get() {
//        println("Some one gets b.")
//        return field
//    }
//
//     protected set(value) {
//        println("Some one sets b.")
//        field = value
//    }
}

fun main(args: Array<String>) {
    println("start")
    val a = A()
    println("init a")
    println(a.b)
    println(a.e)
    a.d = X()
    println(a.d)
//    println(a.c)

    println(a.cc?.length)

}