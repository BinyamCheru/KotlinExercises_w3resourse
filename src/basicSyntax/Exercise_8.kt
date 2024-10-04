package basicSyntax

// Write a Kotlin program to find the factorial of a given number.

fun main (){
    val num = 5
    var factorial = 1
    for ( i in num downTo 2){
        factorial *= i

    }
    println(factorial)
}

/* Answer from w3resource
fun main() {
    val number = 5
    val factorial = calculateFactorial(number)
    println("Factorial of $number: $factorial")
 }

fun calculateFactorial(number: Int): Long {
    return if (number == 0 || number == 1) {
        1
    } else {
        var result = 1L
        for (i in 2..number) {
            result *= i
        }
        result
    }
}
*/