package lambdaExpressions

// Write a Kotlin program that implements a lambda expression to check if a number is even.
fun main(){
    val number = 58
    val isEven: (Int) -> (Boolean) = { it -> it % 2==0 } // if (it%2==0) true else false
    if (isEven(number))
        println("The number is even")
    else
        println("The number is odd")

}