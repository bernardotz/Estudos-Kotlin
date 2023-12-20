package jogodavelha


var count = 0
var jogadas = 0

fun main() {

    val matrix = arrayOf(
        arrayOf(0, 0, 0),
        arrayOf(0, 0, 0),
        arrayOf(0, 0, 0),
    )

    menuInicial(matrix)

    while (true) {

        if (count % 2 == 0) println("Vez do jogador 1")
        else println("Vez do jogador 2")

        println("Digite a posição da linha")
        val linhaPosition = readln().toInt() - 1
        println("Digite a posição da coluna")
        val colunaPosition = readln().toInt() - 1

        if (campoEstaVazio(matrix, linhaPosition, colunaPosition)) {
            matrix[linhaPosition][colunaPosition] = (count % 2) + 1
            println()
            imprimirMatrix(matrix)
        }
        count++
        jogadas++

        if (verificarGanhador(matrix)) break

        if (jogadas == 9) {
            println()
            println("DEU VELHA!!!")
            break
        }
    }
}

private fun verificarGanhador(matrix: Array<Array<Int>>): Boolean {
    //HORIZONTAL - X
    if (matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][2] == 1) {
        println("JOGADOR 1 VENCEU")
        return true
    } else if (matrix[1][0] == 1 && matrix[1][1] == 1 && matrix[1][2] == 1) {
        println("JOGADOR 1 VENCEU")
        return true
    } else if (matrix[2][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) {
        println("JOGADOR 1 VENCEU")
        return true
    }

    //VERTICAL - X
    else if (matrix[0][0] == 1 && matrix[1][0] == 1 && matrix[2][0] == 1) {
        println("JOGADOR 1 VENCEU")
        return true
    } else if (matrix[0][1] == 1 && matrix[1][1] == 1 && matrix[2][1] == 1) {
        println("JOGADOR 1 VENCEU")
        return true
    } else if (matrix[0][2] == 1 && matrix[1][2] == 1 && matrix[2][2] == 1) {
        println("JOGADOR 1 VENCEU")
        return true
    }

    //DIAGONAL - X
    else if (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) {
        println("JOGADOR 1 VENCEU")
        return true
    } else if (matrix[0][2] == 1 && matrix[1][1] == 1 && matrix[2][0] == 1) {
        println("JOGADOR 1 VENCEU")
        return true
    }

    //HORIZONTAL - O
    if (matrix[0][0] == 2 && matrix[0][1] == 2 && matrix[0][2] == 2) {
        println("JOGADOR 2 VENCEU")
        return true
    } else if (matrix[1][0] == 2 && matrix[1][1] == 2 && matrix[1][2] == 2) {
        println("JOGADOR 2 VENCEU")
        return true
    } else if (matrix[2][0] == 2 && matrix[2][1] == 2 && matrix[2][2] == 2) {
        println("JOGADOR 2 VENCEU")
        return true
    }

    //VERTICAL - O
    else if (matrix[0][0] == 2 && matrix[1][0] == 2 && matrix[2][0] == 2) {
        println("JOGADOR 2 VENCEU")
        return true
    } else if (matrix[0][1] == 2 && matrix[1][1] == 2 && matrix[2][1] == 2) {
        println("JOGADOR 2 VENCEU")
        return true
    } else if (matrix[0][2] == 2 && matrix[1][2] == 2 && matrix[2][2] == 2) {
        println("JOGADOR 2 VENCEU")
        return true
    }

    //DIAGONAL - O
    else if (matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2) {
        println("JOGADOR 2 VENCEU")
        return true
    } else if (matrix[0][2] == 2 && matrix[1][1] == 2 && matrix[2][0] == 2) {
        println("JOGADOR 2 VENCEU")
        return true
    }

    return false
}

private fun campoEstaVazio(matrix: Array<Array<Int>>, linha: Int, coluna: Int): Boolean {
    if (matrix[linha][coluna] == 0) return true
    else {
        println()
        println("CAMPO PREENCHIDO, ESCOLHA NOVAMENTE")
        println()
        count--
        jogadas--
    }
    return false
}

private fun menuInicial(matrix: Array<Array<Int>>) {
    println("                 Bem-Vindo ao jogo da velha")
    println("Primeiro informe a linha e em seguida a coluna de onde deseja jogar")
    println()
    imprimirMatrix(matrix)
    println()
}

private fun imprimirMatrix(matrix: Array<Array<Int>>) {
    matrix.forEach { linha ->
        linha.forEach { coluna ->
            when (coluna) {
                1 -> print("X ")
                2 -> print("O ")
                else -> print("- ")
            }
        }
        println()
    }
}