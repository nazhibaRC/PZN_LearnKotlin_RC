fun main() {
    val n:String = "nadzib"
    println(n.h())


    println("anything".any())
    

}


fun String.h():String = "halo ${this}"
fun String.any():String = "help ${this}"



