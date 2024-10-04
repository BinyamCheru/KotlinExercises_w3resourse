package basicSyntax

// Write a Kotlin program to convert temperature from Celsius to Fahrenheit and vice versa.
fun main(args: Array<String>)
{
    println("Choose an option:")
    println("1. Convert Celsius to Fahrenheit")
    println("2. Convert Fahrenheit to Celsius")
    val option = readLine()?.toIntOrNull()
    println("Choice = $option")
    if (option != null && (option == 1 || option == 2) ) {
        println("Enter the temperature:")
        val temperature = readLine()?.toDoubleOrNull()

        if (temperature != null) {
            when (option) {
                1 -> {
                    val fahrenheit = celsiusToFahrenheit(temperature)
                    println("Temperature in Celsius: $temperature")
                    println("Temperature in Fahrenheit: $fahrenheit")
                }
                2 -> {
                    val celsius = fahrenheitToCelsius(temperature)
                    println("Temperature in Fahrenheit: $temperature")
                    println("Temperature in Celsius: $celsius")
                }
            }
        } else {
            println("Invalid temperature. Please enter a valid numeric value.")
        }
    } else {
        println("Invalid option. Please choose option 1 or 2.")
    }
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9 / 5) + 32
}

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}
