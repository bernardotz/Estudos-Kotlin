package uri

import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val number = scan.nextInt()

    val mes = when (number) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> println("mes invalido")
    }
    println(mes)
}