package controlFlow

// Write a Kotlin program to generate the multiplication table of a given number.

fun main() {
    // Change this value to generate the multiplication
    //  table for a different number

    val number = 7

    println("Multiplication table of $number:")
    generateMultiplicationTable(number)
}

fun generateMultiplicationTable(number: Int) {
    for (i in 1..10) {
        val result = number * i
        println("$number * $i = $result")
    }
}
