package controlFlow

// Write a Kotlin program to count the number of even and odd elements in an array.
fun main(){
    var countEven = 0
    var countOdd = 0
    val array = arrayOf(4,7,8,2,4,9,7,5,7,8)
    for (i in 0..array.size-1){
        if (array[i] %2 == 0){
            countEven++
        }else{
            countOdd++
        }
    }
    println("The number of evens in the array: $countEven")
    println("The number of odds in the array: $countOdd")
}