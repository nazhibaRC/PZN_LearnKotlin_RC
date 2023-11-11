fun main() {
    println( ht("nadzib",10,10,10,10,10))
}

fun ht(n:String,vararg xs:Int):Int{
    var t = 0
    for (x in xs){
        t += x
    }
    return t
}