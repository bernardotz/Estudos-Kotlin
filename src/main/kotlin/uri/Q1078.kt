package uri

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val number = scan.nextInt()

    if (number > 2 && number < 1000) {
        for (i in 1..10) {
            println("$i x $number = ${i * number}")
        }
    }
}