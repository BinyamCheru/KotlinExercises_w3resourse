package basicSyntax

// Write a Kotlin program to check if a given year is a leap year.

fun main() {
    val year = 2000
    //val year = 2003

    if (isLeapYear(year))
    {
        println("$year is a leap year.")
    }
    else
    {
        println("$year is not a leap year.")
    }
}

fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}
