package controlFlow

// Write a Kotlin program to print the Fibonacci series up to a given number.
fun main (){
    val n = 5
    val fibonacciSequence= mutableListOf(1,1)
    for (i in 1..n - 2){
        val size = fibonacciSequence.size;
        fibonacciSequence.add( fibonacciSequence[size-1] + fibonacciSequence[size-2] )
    }
    println(fibonacciSequence)
}

/* Answer from w3resource
 fun main() {
    val n = 30

    println("Fibonacci series up to $n:")
    printFibonacciSeries(n)
}

fun printFibonacciSeries(n: Int) {
    var num1 = 0
    var num2 = 1

    print("$num1, $num2")

    while (num2 <= n) {
        val nextNum = num1 + num2
        if (nextNum<=n)
        {
        print(", $nextNum")
        }
        num1 = num2
        num2 = nextNum
    }
}

 */