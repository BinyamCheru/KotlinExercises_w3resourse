package basicSyntax

//Write a Kotlin program to take user input and display it.
fun main (){

    println("Enter something: ")
    val userInput = readlnOrNull() // or readLine() in older versions
    if (userInput != null && userInput.isNotEmpty()) {
        println(userInput) // User entered valid input, so print it.
    } else {
        println("You have entered nothing!!") // Executes if input is null or empty.
    }
}

