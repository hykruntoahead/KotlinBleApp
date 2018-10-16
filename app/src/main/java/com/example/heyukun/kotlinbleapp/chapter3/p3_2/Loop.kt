package com.example.heyukun.kotlinbleapp.chapter3.p3_2

fun main(args: Array<String>) {

    /**
     * for 循环  in -->  iterator()
     */
    for (arg in args) {
        println("arg : $arg")
    }

    for ((index, value) in args.withIndex()) {
        println("index= $index ;value= $value")
    }

    for (indexValue in args.withIndex()) {
        println("index= ${indexValue.index} ;value= ${indexValue.value}")
    }

    println("================for :自定义class 实现 iterator()===============")
    var list = MyIntList()

    list.add(1)
    list.add(2)
    list.add(4)

    for (l in list){
        println(l)
    }

    println("================do-while;continue===============")

    var x = 5
    do {
        println(x)
        if (x == 4) {
            x = 2
            continue
        }
        x--
    }while (x > 0)

    println("===============while；break===================")

    x = 6
    while (x >0){
        println(x)
        x--
        if (x == 2) break
    }

}

class MyIterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()
    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int: Int) {
        list.remove(int)
    }

    operator fun iterator(): MyIterator {
        return MyIterator(list.iterator());
    }
}