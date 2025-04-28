fun main() {
    val a = 5
    val b = 8
    val num = (minOf(a, b)..maxOf(a, b)).toList()
    println("Введеные числа: $a , $b")
    println("Массив: ${num.joinToString(", ")}")
}
