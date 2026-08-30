class CoreScheduler(private val state: Int = 94) {
    fun handle(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 94) % 997
        }
        return value
    }
}

fun main() {
    println(CoreScheduler().handle(94))
}
