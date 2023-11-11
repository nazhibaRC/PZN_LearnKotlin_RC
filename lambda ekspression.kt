fun toUp(value: String):String = value.toUpperCase()


fun main() {
    val cc:(String,String) -> String = {
        fn:String, ln:String ->
        val r = "${fn} ${ln}"
        r
    }
    val ee = cc("Nadzib","hibatulloh")
    println(ee)


    val sy: (String) -> String = {value:String ->
        "Hello $value"
    }

    println(sy("dudung"))


    val toUp:(String) -> String = ::toUp
    println(toUp("SS"))
}