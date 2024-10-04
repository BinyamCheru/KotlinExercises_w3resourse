package controlFlow

// Write a Kotlin program to print the Pascal's triangle of a given number of rows.

fun printPascalTriangle(rows: Int) {
    require(rows > 0) { "Number of rows must be greater than 0." }

    var prevRow = mutableListOf(1)
    println(prevRow.joinToString(" "))

    for (currentRow in 1 until rows) {
        val nextRow: MutableList<Int> = mutableListOf()

        nextRow.add(1) // First element is always 1
        for (i in 1 until currentRow) {
            val sum = prevRow[i - 1] + (prevRow.getOrNull(i) ?: 0)
            nextRow.add(sum)
        }
        nextRow.add(1) // Last element is always 1

        println(nextRow.joinToString(" "))

        prevRow = nextRow
    }
}

fun main() {
    val numRows = 7
    printPascalTriangle(numRows)
}