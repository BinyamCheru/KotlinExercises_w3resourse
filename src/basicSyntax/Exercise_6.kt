package basicSyntax

//Write a Kotlin program to check if a given number is even or odd.

fun main(){

    val number = readLine()?.toIntOrNull()
    if ( number != null ){
        if ( number%2 == 0 ){
            println("$number is even")
        }else{
            println("$number is odd")
        }
    }else {
        println("Invalid Input")
    }

}