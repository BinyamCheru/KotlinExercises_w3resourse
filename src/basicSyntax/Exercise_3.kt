package basicSyntax

// Write a Kotlin program to display the current date and time.

import java.util.Date
import java.text.SimpleDateFormat

fun main() {
    // Date class: Represents a specific moment in time, with millisecond precision.
    // Create a Date object representing the current date and time.
    val currentDate = Date()

    // SimpleDateFormat class: Used to format dates into strings and parse strings into dates.
    // Create a SimpleDateFormat object to specify the desired date format (yyyy-MM-dd HH:mm:ss).
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

    // format method: Converts the Date object into a String based on the specified format.
    // Format the current date into a string using the specified format.
    val formattedDate = dateFormat.format(currentDate)

    // Print the formatted date and time to the console.
    println("Current Date and Time: $formattedDate")
}
