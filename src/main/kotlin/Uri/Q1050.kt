package Uri

import java.util.Scanner

fun main() {

    val leitor = Scanner(System.`in`)
    val number = leitor.nextInt()
    val result = when (number) {
        61 -> "Brasilia"
        71 -> "Salvador"
        11 -> "Sao Paulo"
        21 -> "Rio de Janeiro"
        32 -> "Juiz de Fora"
        19 -> "Campinas"
        27 -> "Vitoria"
        31 -> "Belo Horizonte"
        else -> "DDD nao cadastrado"
    }
    println(result)
}