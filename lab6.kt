fun main() {
    val a = intArrayOf(5,8,18,34,3,56,43,27,4,23)
    
    val sr = a.average()
    println("Среднее арифметическое: $sr")
    
    println("Элементы массива, большие среднего:")
     a.filter { it > sr }.forEach { print("$it ") }
}
