class LocalFactory(private val state: Int = 9) {
    fun fetch(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 9) % 997
        }
        return acc
    }
}

fun main() {
    println(LocalFactory().fetch(9))
}
