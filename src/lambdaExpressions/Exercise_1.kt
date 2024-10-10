package lambdaExpressions
/*
{ parameter1: Type1, parameter2: Type2 ->
    // Code to execute
}
{ it ->
    // Code to execute using 'it'
}
 */

//  Write a Kotlin program that implements a lambda expression to multiply two numbers and return the result.
fun main (){

    val num1 = 23
    val num2 = 34

    val product: (Int, Int) -> (Int) = {a,b -> a*b}

    println("$num1 x $num2 = ${product(num1,num2)}")

}