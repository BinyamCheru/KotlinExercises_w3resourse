package lambdaExpressions

//  Write a Kotlin program that implements a lambda expression to filter a list of strings. It returns only strings starting with the letter 'K'.
fun main() {
    val strings = listOf("Kotlin", "Java", "Kotlin Programming", "Python", "Kotlin Language")

    val filteredList = strings.filter { it.startsWith("K") }

    println("Filtered List:")
    filteredList.forEach { println(it) }

}
