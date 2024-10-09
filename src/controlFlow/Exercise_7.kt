package controlFlow

// Write a Kotlin program to calculate the sum of all numbers between two given numbers.

fun main (){
    val num1 = 0
    val num2 = 2

    if( num2 == num1 ){
        println("The numbers are equal Sum: 0.")
    }else{
        var sum = 0
        var smaller = if (num1 < num2 ) num1 + 1 else num2 + 1

        while ( smaller != num1 && smaller != num2 ){
            sum = sum + smaller
            smaller++
        }

        println(sum)
    }
}

/* Answer from w3resource
fun main() {
    val start = 15
    val end = 25

    val sum = calculateSum(start, end)
    println("Sum of numbers between $start and $end: $sum")
}

fun calculateSum(start: Int, end: Int): Int {
    var sum = 0

    for (num in start..end) {
        sum += num
    }

    return sum
}

 */