package basicSyntax

//Write a Kotlin program to find the maximum and minimum of three numbers.

fun main(){

    val num1 = 23
    val num2 = 34
    val num3 = 43

    val max = if ( num1 >= num2 && num1 >= num3){
        num1
    }else if ( num2 >= num1 && num2 >= num3 ){
        num2
    }else{
        num3
    }

    val min = if ( num1 <= num2 && num1 <= num3){
        num1
    }else if ( num2 <= num1 && num2 <= num3 ){
        num2
    }else{
        num3
    }

    println("The Maximum number is: $max")
    println("The Minimum number is: $min")

}

/*
Answer from the w3resourse
 fun main() {
    val number1 = 12
    val number2 = 10
    val number3 = 19

    println("Three numbers are: $number1,$number2,$number3")
    val maximum = maxOf(number1, number2, number3)
    val minimum = minOf(number1, number2, number3)
    println("Maximum of above three numbers: $maximum")
    println("Minimum of above three numbers: $minimum")

}
*/