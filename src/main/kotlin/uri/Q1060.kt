package uri

import java.util.Scanner

fun main() {

    val leitor = Scanner(System.`in`)
    val num1 = leitor.nextFloat()
    val num2 = leitor.nextFloat()
    val num3 = leitor.nextFloat()
    val num4 = leitor.nextFloat()
    val num5 = leitor.nextFloat()
    val num6 = leitor.nextFloat()

    val lista = listOf(num1, num2, num3, num4, num5, num6)
    var cont = 0
    for (i in 0..5) {
        if (lista.get(i) > 0) cont++
    }
    println("$cont valores positivos")
}