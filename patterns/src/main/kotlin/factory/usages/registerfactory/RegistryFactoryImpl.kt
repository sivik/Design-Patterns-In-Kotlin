package factory.usages.registerfactory

//A very good example borrowed from : https://asvid.github.io/kotlin-factory-method

fun main() {
    // AirFilter has a companion object with method `create()` so a Static Factory Method
    val airFilter: Part = AirFilter.create()
    val fuelFilter: Part = FuelFilter.create()
    //val fuelFilter: Part = FuelFilter() // error, private constructor doesn't allow it

// registering the factory, class name points to companion object
    RandomPartCreator.registerFactory(AirFilter)
    RandomPartCreator.registerFactory(FuelFilter)
    RandomPartCreator.registerFactory(OilFilter)
// factory not being a companion object can also be registered
    RandomPartCreator.registerFactory(EngineFactory())

// let's have 10 instances
    repeat(10) {
        // random instance creating, we don't know the concrete type
        val randomPart = RandomPartCreator.createRandomPart()
        println(randomPart.description())
        // unless we explicitly check
        println("is it an AirFilter? ${randomPart is AirFilter}")
    }
}