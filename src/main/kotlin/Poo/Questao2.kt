package Poo

class Dog(var name: String, var breed: String)

fun main() {
    var dog1 = Dog("bob", "vira-lata")
    var dog2 = Dog("thor", "pitbull")

    dog1.name = "ralf"
}