package uri

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)
    val inicio: Int = scan.nextInt()
    val fim: Int = scan.nextInt()

    if (inicio > fim) {
        val subtracao = (24 - inicio) + fim
        println("O JOGO DUROU $subtracao HORA(S)")
    } else if (inicio < fim) {
        val adicao = fim - inicio
        println("O JOGO DUROU $adicao HORA(S)")
    } else {
        val nulo = 24
        println("O JOGO DUROU $nulo HORA(S)")
    }
}