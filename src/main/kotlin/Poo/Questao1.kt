package Poo

class Person(private val name: String, private val age: Int){
    override fun toString(): String {
        return "My name is $name and i'm $age"
    }
}

fun main() {
    val p1 = Person("Bernardo", 19)
    val p2 = Person("Henrique", 27)

    println(p1)
    println(p2)
}
