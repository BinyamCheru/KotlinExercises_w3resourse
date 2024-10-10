package lambdaExpressions

//  Write a Kotlin program that implements a lambda expression to find the square of a number and return the result.
fun main(){

    val num1 = 23

    val square: (Int) -> (Int) = {it -> it*it}

    println("Square of $num1 = ${square(num1)}")

}