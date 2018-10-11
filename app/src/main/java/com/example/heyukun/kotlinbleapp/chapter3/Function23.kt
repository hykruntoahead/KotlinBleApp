package com.example.heyukun.kotlinbleapp.chapter3

//23个参数时编译出错
/**
 * fun hello(action: (Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int，Int)-> Unit){
      action(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)
    }
 */
fun hello(action: (Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int)-> Unit){
    action(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21)
}

fun main(args: Array<String>) {
    hello{i0, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21 ->
        println("$i0, $i1, $i2, $i3, $i4, $i5, $i6, $i7, $i8, " +
                "$i9, $i10, $i11, $i12, $i13, $i14, $i15, $i16, $i17, $i18, $i19, $i20, $i21")
    }
}