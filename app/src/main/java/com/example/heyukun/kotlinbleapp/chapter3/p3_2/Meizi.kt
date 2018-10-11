package com.example.heyukun.kotlinbleapp.chapter3.p3_2

class Meizi(var 性格: String, var 长相: String, var 声音: String) {
    fun singSong(songName: String) {
        println("妹子正在唱歌:$songName")
    }

    fun dance(danceName: String) {
        println("妹子正在跳舞:$danceName")
    }
}

fun main(args: Array<String>) {
    val aMeizi = Meizi("彪悍", "萌萌的", "未知")
    aMeizi.singSong("歌唱祖国")
    aMeizi.dance("天鹅湖")
}

