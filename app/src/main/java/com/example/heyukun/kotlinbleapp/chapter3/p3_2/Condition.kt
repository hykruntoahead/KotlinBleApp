package com.example.heyukun.kotlinbleapp.chapter3.p3_2



private const val USERNAME = "kotlin"
private const val PASSWORD = "jetbrains"

private const val ADMIN_USER = "admin"
private const val ADMIN_PASSWD = "admin"


private const val DEBUG = 1
private const val USER = 0

fun main(args: Array<String>) {
    /**
     * if 表达式
     */
    val mode = if (args.isNotEmpty() && args[0] == "1"){
        DEBUG
    }else{
        USER
    }


    println("输入用户名:")
    val username = readLine()
    println("输入密码")
    val password = readLine()

    if (mode == DEBUG && username == ADMIN_USER && password == ADMIN_PASSWD){
        println("管理员登录成功")
    }else if (mode == USER && username == USERNAME && password == PASSWORD){
        println("登录成功")
    } else{
        println("登录失败")
    }
}