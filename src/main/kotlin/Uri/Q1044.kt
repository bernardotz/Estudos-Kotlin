package Uri

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)
    val value1: Int = scan.nextInt()
    val value2: Int = scan.nextInt()

    if (value1 % value2 === 0 || value2 % value1 === 0) println("Sao Multiplos")
    else println("Nao sao Multiplos")

}