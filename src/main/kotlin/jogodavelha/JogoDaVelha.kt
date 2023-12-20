package jogodavelha

fun main() {
    val tabuleiro = Tabuleiro()
    val jogo = JogoDaVelha(tabuleiro)
    jogo.inciarJogo()
}

class JogoDaVelha(private val tabuleiro: Tabuleiro) {

    fun inciarJogo() {
        menuInicial()

        while (true) {

            if (count % 2 == 0) println("Vez do jogador 1")
            else println("Vez do jogador 2")

            println("Digite a posição da linha")
            val linhaPosition = readln().toInt() - 1
            println("Digite a posição da coluna")
            val colunaPosition = readln().toInt() - 1


            if (tabuleiro.verificarCampoVazio(linhaPosition, colunaPosition)) {
                tabuleiro.marcarPosicao(linhaPosition, colunaPosition, jogadorDaVez())
                tabuleiro.imprimir()
            } else {
                println()
                println("CAMPO PREENCHIDO, ESCOLHA NOVAMENTE")
                println()
                count--
                jogadas--
            }

            if (tabuleiro.verificarCondicaoDeVitoria()) {
                println("Jogador ${jogadorDaVez()} ganhou")
                break
            }

            count++
            jogadas++

            if (jogadas == 9) {
                println()
                println("DEU VELHA!!!")
                break
            }
        }

    }

    fun jogadorDaVez(): Int {
        return (count % 2) + 1
    }

    private fun menuInicial() {
        println("                 Bem-Vindo ao jogo da velha")
        println("Primeiro informe a linha e em seguida a coluna de onde deseja jogar")
        println()
        tabuleiro.imprimir()
        println()
    }
}

class Tabuleiro {

    private val matrix = arrayOf(
        arrayOf(0, 0, 0),
        arrayOf(0, 0, 0),
        arrayOf(0, 0, 0),
    )

    fun imprimir() {
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

    fun verificarCampoVazio(linha: Int, coluna: Int): Boolean {
        return matrix[linha][coluna] == 0
    }

    fun marcarPosicao(linhaPosition: Int, colunaPosition: Int, jogador: Int) {
        matrix[linhaPosition][colunaPosition] = jogador
    }

    fun verificarCondicaoDeVitoria(): Boolean {
        //HORIZONTAL - X
        if (matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][2] == 1) return true
        else if (matrix[1][0] == 1 && matrix[1][1] == 1 && matrix[1][2] == 1) return true
        else if (matrix[2][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) return true

        //VERTICAL - X
        else if (matrix[0][0] == 1 && matrix[1][0] == 1 && matrix[2][0] == 1) return true
        else if (matrix[0][1] == 1 && matrix[1][1] == 1 && matrix[2][1] == 1) return true
        else if (matrix[0][2] == 1 && matrix[1][2] == 1 && matrix[2][2] == 1) return true

        //DIAGONAL - X
        else if (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) return true
        else if (matrix[0][2] == 1 && matrix[1][1] == 1 && matrix[2][0] == 1) return true

        //HORIZONTAL - O
        if (matrix[0][0] == 2 && matrix[0][1] == 2 && matrix[0][2] == 2) return true
        else if (matrix[1][0] == 2 && matrix[1][1] == 2 && matrix[1][2] == 2) return true
        else if (matrix[2][0] == 2 && matrix[2][1] == 2 && matrix[2][2] == 2) return true

        //VERTICAL - O
        else if (matrix[0][0] == 2 && matrix[1][0] == 2 && matrix[2][0] == 2) return true
        else if (matrix[0][1] == 2 && matrix[1][1] == 2 && matrix[2][1] == 2) return true
        else if (matrix[0][2] == 2 && matrix[1][2] == 2 && matrix[2][2] == 2) return true

        //DIAGONAL - O
        else if (matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2) return true
        else if (matrix[0][2] == 2 && matrix[1][1] == 2 && matrix[2][0] == 2) return true

        return false
    }

}
