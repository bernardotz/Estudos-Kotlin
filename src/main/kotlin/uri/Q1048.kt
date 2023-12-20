package uri

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)
    val salario = scan.nextFloat()

    if (salario >= 0 && salario <= 400.00) {
        println("      Novo salario: ${salario + (salario * 0.15)}")
        print(salario)
        println(" Reajuste ganho: ${salario * 0.15}")
        println("      Em percentual: 15%")
    } else if (salario >= 400.01 && salario <= 800.00) {
        println("      Novo salario: ${salario + (salario * 0.12)}")
        print(salario)
        println(" Reajuste ganho: ${salario * 0.12}")
        println("      Em percentual: 12%")
    } else if (salario >= 800.01 && salario <= 1200.00) {
        println("      Novo salario: ${salario + (salario * 0.10)}")
        print(salario)
        println(" Reajuste ganho: ${salario * 0.10}")
        println("      Em percentual: 10%")
    } else if (salario >= 1200.01 && salario <= 2000.00) {
        println("      Novo salario: ${salario + (salario * 0.07)}")
        print(salario)
        println(" Reajuste ganho: ${salario * 0.07}")
        println("      Em percentual: 7%")
    } else if (salario > 2000.01) {
        println("      Novo salario: ${salario + (salario * 0.04)}")
        print(salario)
        println(" Reajuste ganho: ${salario * 0.04}")
        println("      Em percentual: 4%")
    } else println("salario invalido")
}