fun main() {
    x("Joko", "Santoso")
    x("Joni")
}

fun x(y:String, z:String? = null){
    if (z == null){
        println("Data nama ${y}")
    } else{
        println("Data Nama Lengkap ${y} ${z}")

    }
}
