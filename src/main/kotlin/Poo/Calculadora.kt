package Poo

class Calculadora {


    fun somar(a: Double, b: Double): Double {
        return a + b
    }

    fun subtrair(a: Double, b: Double): Double {
        return a - b
    }

    fun multiplicar(a: Double, b: Double): Double {
        return a * b
    }

    fun dividir(a: Double, b: Double): Double {
        if (b != 0.0) {
            return a / b
        } else{
            throw IllegalArgumentException("Não é possível dividir por zero.")
        }
    }


}

