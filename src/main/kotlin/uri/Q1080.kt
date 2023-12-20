package uri

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)
    var maior = 0
    var posMaior = 1
    var x = 0
    for (i in 1..100){
        x = scan.nextInt()
        if (i === 1) {
            maior = x
            posMaior = 1
        }else if (x > maior) {
            maior = x
            posMaior = i
        }
        }
    println(maior)
    println(posMaior)
}