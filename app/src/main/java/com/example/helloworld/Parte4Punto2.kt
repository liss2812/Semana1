package com.example.helloworld

fun main(){
//se le dan los valores a lso arrays
    val array1 = arrayOf<Int>()
    val array2 = arrayOf<Int>(2,42,6)
    val array3 = arrayOf<Int>(10,5,30)
    val array4 = arrayOf<Int>(6,8,9)
    val array5 = arrayOf<Int>()
    val array6 = arrayOf<Int>(5,6,9)
    val array7 = arrayOf<Int>(5,5,10)
    val array8 = arrayOf<Int>()
    val array9= arrayOf<Int>()
    val array10 = arrayOf<Int>(1,10,66)

    //se suman los valores de los arrays

    val prueba1 = sumarrays(array1)
    val prueba2 = sumarrays(array2)
    val prueba3 = sumarrays(array3)
    val prueba4 = sumarrays(array4)
    val prueba5 = sumarrays(array5)
    val prueba6 = sumarrays(array6)
    val prueba7 = sumarrays(array7)
    val prueba8 = sumarrays(array8)
    val prueba9 = sumarrays(array9)
    val prueba10 = sumarrays(array10)

    //se imprimen los resultados
    println("Test1 pasado ${prueba1==-1}")
    println("Test2 pasado ${prueba2==50}")
    println("Test3 pasado ${prueba3==45}")
    println("Test4 pasado ${prueba4==23}")
    println("Test5 pasado ${prueba5==-1}")
    println("Test6 pasado ${prueba6==20}")
    println("Test7 pasado ${prueba7==20}")
    println("Test8 pasado ${prueba8==-1}")
    println("Test9 pasado ${prueba9==-1}")
    println("Test10 pasado ${prueba10==77}")

}

fun sumarrays(args : Array<Int>): Int{
    var datos = 0
    if (args.isNotEmpty()){
        for (index in args){
            datos = datos + index
        }
    } else{
        datos = -1
    }
    return datos
}