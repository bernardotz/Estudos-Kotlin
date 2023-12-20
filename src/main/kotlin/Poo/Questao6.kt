package Poo

class Employee(
    val name: String,
    var role: String,
    private var salary: Double,
    private var bonus: Double,
    private var sales: Double
) {
    override fun toString(): String {
        return "Employee $name will receive a salary of ${calculateTotalCompensation()}"
    }

    fun calculateTotalCompensation(): Double {
        return salary + bonus + (sales * 0.40)
    }
}

fun main() {
    val emp1 = Employee("Bernardo", "Junior", 3000.0, 200.0, 26000.0)
    val totalCompensation = emp1.calculateTotalCompensation()
    println(emp1)
}

