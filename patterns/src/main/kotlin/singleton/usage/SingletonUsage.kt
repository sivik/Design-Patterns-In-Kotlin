package singleton.usage

import singleton.CustomSingleton
import singleton.Singleton

fun main(){

    for (i in 1..10) {
        println(CustomSingleton.increment())
    }

    val first = Singleton.instance
    val second = Singleton.instance
    first.connectionString = "My connection string"
    println(first.connectionString)
    println(second.connectionString)
}