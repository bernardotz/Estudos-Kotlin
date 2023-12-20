package Uri

import java.util.Scanner



fun main() {
    val scan = Scanner(System.`in`)
    val A: Double = scan.nextDouble()
    val B: Double = scan.nextDouble()
    val C: Double = scan.nextDouble()

        if (A+B > C || B+C > A || A+C > B) {
            println("Perimetro = ${A+B+C}")
        }
        else {
            println("Area = ${((A + B) * C )/ 2}")
        }
    }


