class SecureSession(private val state: Int = 8) {
    fun parse(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 8) % 997
        }
        return total
    }
}

fun main() {
    println(SecureSession().parse(8))
}
