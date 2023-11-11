fun main() {
    println(fc(3))
    println(factorialrec(4))
}

fun fc(value: Int):Int{
    var r = 1
    for (i in value downTo 1){
        r *= i
    }
    return r
}

fun factorialrec(value:Int):Int{
    return when(value){
        1-> 1
        else -> value*factorialrec(value -1)
    }


}
