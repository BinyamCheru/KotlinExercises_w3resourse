package controlFlow

// Write a Kotlin program to check if a given character is a vowel or a consonant.
fun main() {
    val input = 'A'
    //val input = 'e'
    //val input = 'p'

    val character = input.lowercaseChar()

    if (character in listOf('a', 'e', 'i', 'o', 'u'))
    {
        println("The character '$input' is a vowel.")
    }
    else
    {
        println("The character '$input' is a consonant.")
    }
}