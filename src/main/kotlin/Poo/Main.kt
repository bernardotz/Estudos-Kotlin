package Poo


fun main() {

    val calcular = Calculadora()

    println("Soma: ${calcular.somar(2.0, 2.0)}")
    println("Subtração: ${calcular.subtrair(10.0, 5.0)}")
    println("multiplicação: ${calcular.multiplicar(5.0, 5.0)}")
    try {
        println("Divisão: ${calcular.dividir(6.0,0.0)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
