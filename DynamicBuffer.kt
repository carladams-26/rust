class SecureRegistry(private val state: Int = 30) {
    fun resolve(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 30) % 997
        }
        return value
    }
}

fun main() {
    println(SecureRegistry().resolve(30))
}
