package singleton

import java.util.concurrent.atomic.AtomicInteger

class Singleton private constructor() {

    init { println("This ($this) is a singleton") }

    private object Holder { val INSTANCE = Singleton() }

    companion object {
        val instance: Singleton by lazy { Holder.INSTANCE }
    }
    var connectionString :String? = null
}

object CustomSingleton {
    private val counter = AtomicInteger(0)

    fun increment() = counter.incrementAndGet()
}