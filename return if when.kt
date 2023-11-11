fun main() {
    println( sw())
    println(sw("Prabowo"))
}

fun sw(x:String = ""):String {
    //    return if (x == ""){
    //        "Hello Anonim"
    //    } else{
    //        "Hello ${x}"
    //
    return when(x){
        "" -> "Hello anonim"
        else -> "Hello ${x}"
    }


}