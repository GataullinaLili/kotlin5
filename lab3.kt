fun main() {
    val a= intArrayOf()
    
    val n = listOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    val array = a.plus(n).toTypedArray()
    
    val min= array.minOrNull()
    val max = array.maxOrNull()
    
    println("Минимальное значение: $min")
    println("Максимальное значение: $max")
}
