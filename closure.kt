fun main() {
    var cc:Int = 0

    var b:() ->Unit = {
        println("Lambda inc")
        cc++
    }


    var a = {
        println("llma increment")
        cc ++
    }

    var annonymos = fun(){
        println("Anonymous function increment")
        cc ++
    }

    fun fi(){
        println("Function Increment")
        cc ++
    }


    fi()
    annonymos()
    a()
    println(cc)



}