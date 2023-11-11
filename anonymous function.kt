fun main() {
    fun act(n:String, tr:(String) -> String):String{
        val s = tr(n)
        return "Tolong ${s}"
    }

    val any = fun(v:String):String{
        if (v.isBlank()){
            return "404 not found"
        }else{
            return v.toUpperCase()
        }
    }

    /*
    Bisa juga tanpa dimasukkan kedalam sebuah variabel
     */
    println(act("Cipung",fun(v:String):String{
        return v.toLowerCase()
    }))



    println(act("Wiranto",any))


}