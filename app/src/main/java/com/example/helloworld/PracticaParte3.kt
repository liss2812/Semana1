package com.example.helloworld

fun main (){
//Ejemplo1
    val myInt = 789
    val myLong = myInt.toLong()

    //Ejemplo2
    val stringNumber = "101" // declarado como cadena
    val intValue = stringNumber.toInt() // conversion a entero
    // manera mas corta
    val intValues = "101".toInt()

    val myTrueBoolean = true
    val myFalseBoolean = false

    val f = 6
    val g = 4
    val h = 3
    val i = 9

    val n = f < i && i > h// n is true



    val myString = "This is a String"
    val escapeString = "This is a string with new line \n"
    val multipleStringLines= """
      
       First Line
       Second Line 
       Third Line
        
    """.trimIndent()
    val accountBalance = 200
    val bankMessage = "Your account balance is $accountBalance"
// Your account balance is 200

      val name ="Liseth"
      val LastName ="Ramos"
    val message = "The first letter in my name is ${name.first()}"
// The first letter in my name is L

    val age = 20
    val anotherMessage = "You are ${if (age > 18) "old" else "young"}"
// You are young
}
 fun array(){
val myArray1 = arrayOf(4, 5, 7, 3)
val myArray2 = arrayOf(4, 5, 7, 3, "Chike", false)

val myArray3 = arrayOf<Int>(4, 5, 7) // will not compile
val myArray4 = intArrayOf(4, 5, 7, 3)  // will not compile
}