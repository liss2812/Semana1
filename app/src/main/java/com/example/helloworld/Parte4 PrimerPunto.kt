package com.example.helloworld


    fun main(){
        val res1 = sumar(1,5)
        val res2 = sumar(-5,100)
        val res3 = sumar(null,null)
        val res4 = sumar(50,100)
        val res5 = sumar(200, 100)
        val res6 = sumar(500, 600)
        val res7 = sumar(20, null)
        val res8 = sumar(100,100)
        val res9 = sumar(null, null)
        val res10 = sumar(500, 500)


        println("Test1 passed ${res1==6}")
        println("Test2 passed ${res2==-1}")
        println("Test3 passed ${res3==-2}")
        println("Test4 passed ${res4==150}")
        println("Test5 passed ${res5==300}")
        println("Test6 passed ${res6==1100}")
        println("Test7 passed ${res7==20}")
        println("Test8 passed ${res8==200}")
        println("Test9 passed ${res9==-2}")
        println("Test10 passed ${res10==1000}")
    }

    fun sumar(n1: Int?, n2: Int?):Int {
        var res = -1
        if (n1 != null && n2 != null){
            if (n1 >= 0 && n2 >= 0) {
                res = n1 + n2
            }
        }else{
            if(n1==null && n2==null){
                res=-2
            }else{
                res = if(n1!=null) n1 else n2!!
            }
        }
        return res
    }

// n1=1, n2=5, res1=6
// n1=-5, n2=100, res2=-1
// n1=null, n2=null, res3=-2
// n1=50, n2=100, res4=150
// n1=200, n2=100, res5=300
// n1=500, n2=600, res6=10100
// n1=20, n2=null, res7=20
// n1=100, n2=100, res8=200
// n1=null, n2=null, res9=-2
// n1=500, n2=500, res10=1000