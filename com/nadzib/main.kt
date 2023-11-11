package com.nadzib


fun a(name:String = "no_name"):String{
    return name
    println("Hello ${name}")

}

fun b(alamat:String = "tidak diketahui"):String{
    return alamat
    println("alamat = ${alamat}")

}

fun main() {


    println(a())
    println(b("JL Purwomartani, Kalasan"))
}