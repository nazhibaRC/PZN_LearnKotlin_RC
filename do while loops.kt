fun main() {
    var m = 1
    var i = 0


    do {
        println("while loop ${m}")
        m++
    } while (m <= 10)



    while (true){
        println("looping ke-${i}")
        i++
        if (i > 1000){
            break
        }
    }


    for (n in 1..1000){
        if (n % 2 == 0){
            continue 
        }
        println(n)
    }
}