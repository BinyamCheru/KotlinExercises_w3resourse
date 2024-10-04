package controlFlow

//  Write a Kotlin program to check if a given number is positive, negative, or zero.
fun main()
{
    val number = 1
    //val number = -4
    //val number = 0

    println("Number is: $number")
    if (number > 0)
    {
        println("The number is positive.")
    }
    else if (number < 0)
    {
        println("The number is negative.")
    }
    else
    {
        println("The number is zero.")
    }
}