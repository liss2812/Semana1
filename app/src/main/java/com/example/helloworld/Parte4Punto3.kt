package com.example.helloworld

fun main(){
    val caso1: Array<Int> = arrayOf(1, 2, 5, 9)
    val caso2: Array<Int> = arrayOf(1, 2, 5, 9)
    val caso3: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    val caso4: Array<Int> = arrayOf(8, 2, 6, 9,7)
    val caso5: Array<Int> = arrayOf(3, 2, 7, 8, 5, 7)
    val caso6: Array<Int> = arrayOf(1, 3, 4, 2, 5, 9)
    val caso7: Array<Int> = arrayOf(1, 2, 5, 9)
    val caso8: Array<Int> = arrayOf(4, 3, 7, 1, 2, 5, 9)
    val caso9: Array<Int> = arrayOf( 2, 5, 9)
    val caso10: Array<Int> = arrayOf(1, 2, 5, 9, 8 ,4, 7)

    val res1 = searchData(caso1, 1) //posicion0
    val res2 = searchData(caso2, 9) //posicion3
    val res3 = searchData(caso3, 100) //posicion6
    val res4 = searchData(caso4, 8) //posicion0
    val res5 = searchData(caso5, 2) //posicion1
    val res6 = searchData(caso6, 1) //posicion0
    val res7 = searchData(caso7, 5) //posicion2
    val res8 = searchData(caso8, 7) //posicion2
    val res9 = searchData(caso9, 9) //posicion2
    val res10 = searchData(caso10, 4) //posicion5

    println("searchData(caso1, n=1) Test passed ${res1==0}")
    println("searchData(caso2, n=9) Test passed ${res2==3}")
    println("searchData(caso3, n=100) Test passed ${res3==6}")
    println("searchData(caso4, n=8) Test passed ${res4==0}")
    println("searchData(caso5, n=2) Test passed ${res5==1}")
    println("searchData(caso6, n=1) Test passed ${res6==0}")
    println("searchData(caso7, n=5) Test passed ${res7==2}")
    println("searchData(caso8, n=7) Test passed ${res8==2}")
    println("searchData(caso9, n=9) Test passed ${res9==2}")
    println("searchData(caso10, n=4) Test passed ${res10==5}")
}

fun searchData(colleccion:Array<Int>, number: Int):Int{
    var pos=0
    for(i in colleccion){
        if(i==number){
            return pos
        }
        pos += 1
    }
    return -1
}