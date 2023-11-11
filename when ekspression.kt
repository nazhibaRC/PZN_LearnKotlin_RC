fun main() {
    val y = "E"

    when(y){
        "A" -> println("hello A")
        "B" -> println("Hello B")
        "C" -> println("Hello C")
        "D" -> println("hello D")
        "E" -> println("Hello E")
    }

    val x:Array<String> = arrayOf("A","B","C"     )
    when (y){
        in x -> {
            println("SELAMAT ANDA LULUS")
        }
        !in x -> {
            println("ANDA TIDAK MUNGKIN LULUS")

        }

    }

}