fun main() {
    val a = intArrayOf(24,-63,67,-12,88,94,-28,82,0,53)

    var min1 = Int.MAX_VALUE
    var min2 = Int.MAX_VALUE

    for (num in a) {
        if (num < min1) {
            min2 = min1
            min1 = num
        } else if (min1 < num && num < min2) {
            min2 = num
        }
    }
 println("Второй самый маленький элемент в массиве: $min2")
}
