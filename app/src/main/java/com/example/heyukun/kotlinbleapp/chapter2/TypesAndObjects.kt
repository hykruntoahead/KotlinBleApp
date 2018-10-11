package com.example.heyukun.kotlinbleapp.chapter2

//类  最终超类 Any
class Meizi ( 性格: String, 长相: String, 声音: String) :人(性格, 长相, 声音)
class 帅哥(性格: String,长相: String,声音: String):人(性格, 长相, 声音)

//需要open 才能被继承
open class 人(var 性格: String, var 长相: String, var 声音: String){
    init {
        println("一个${this.javaClass.simpleName}，性格$性格 ，长相:$长相 ,声音:$声音")
    }
}


fun main(args: Array<String>) {
    val myFav: Meizi = Meizi("温柔", "甜美", "动听")
    val myLove: 帅哥 = 帅哥("彪悍", "萌帅", "磁性")

    println(myFav is 人)
}