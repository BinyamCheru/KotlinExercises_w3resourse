package controlFlow

// Write a Kotlin program to check if a given number is divisible by 7.
fun main()
{
    val number = 14
    //val number = 17
    println("Number is $number")
    if ( number % 7 == 0 )
    {
        println("The number is divisible by 7.")
    }
    else
    {
        println("The number is not divisible by 7.")
    }
}
