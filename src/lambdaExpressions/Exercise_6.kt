package lambdaExpressions

// Write a Kotlin program that implements a lambda expression to sort a list of integers in descending order.
fun main() {
    val numbers = listOf(10, 2, 7, 4, 1, 5, 8, 9, 3, 6)

    val sortedList = numbers.sortedByDescending { it }

    println("Sorted List in Descending Order:")
    sortedList.forEach { println(it) }

}
