package basicSyntax

//Write a Kotlin program to perform addition, subtraction, multiplication and division of two numbers.
fun main(args: Array<String>) {

        val number1 = readLine()!!.toDoubleOrNull()
        val number2 = readLine()!!.toDoubleOrNull()

        if (number1 != null && number2 != null) {
            val sum = number1 + number2
            val difference = number1 - number2
            val product = number1 * number2
            val quotient = number1 / number2

            println("Sum: $sum")
            println("Difference: $difference")
            println("Product: $product")
            println("Quotient: $quotient")
        } else {
            println("Invalid input. Please enter valid numbers.")
        }
}
