package lambdaExpressions

// Write a Kotlin program that implements a lambda expression to calculate the average of a list of numbers.
fun main() {
    val numbers = listOf(10, 20, 30, 40, 50, 60, 70)

    val average: ( List<Int> ) -> (Double) = { nums ->
        if (nums.isEmpty()) {
            throw IllegalArgumentException("List cannot be empty")
        }
        val sum = nums.sum()
        sum.toDouble() / nums.size
    }

    val result = average(numbers)

    println("Average: $result")
}
