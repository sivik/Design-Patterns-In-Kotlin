package factory.usages.registerfactory

import kotlin.random.Random

// interface implemented by every Part constructed by the Factory
interface Part {
    fun description(): String
}

// interface used by companion objects, building concrete `Part` type
interface PartFactory<T : Part> {
    fun create(): T
}

// concrete Part implementation with private constructor
internal class FuelFilter private constructor() : Part {
    // companion object implementing Factory interface
    companion object Factory : PartFactory<FuelFilter> {
        // Static Factory Method creating an instance of the declared type
        override fun create(): FuelFilter = FuelFilter()
    }

    override fun description() = "I'm a Fuel Filter"
}

internal class AirFilter private constructor() : Part {
    // companion object implementing Factory interface
    companion object Factory : PartFactory<AirFilter> {
        // Static Factory Method creating an instance of the declared type
        override fun create(): AirFilter = AirFilter()
    }

    override fun description() = "I'm a Air Filter"
}

internal class OilFilter private constructor() : Part {
    // companion object implementing Factory interface
    companion object Factory : PartFactory<OilFilter> {
        // Static Factory Method creating an instance of the declared type
        override fun create(): OilFilter = OilFilter()
    }

    override fun description() = "I'm a Oil Filter"
}

// class without companion object also can be used
class Engine : Part {
    override fun description() = "I'm an Engine!"
}

// with an external factory
class EngineFactory : PartFactory<Engine> {
    override fun create(): Engine {
        // Engine class can't have private constructor though
        return Engine()
    }
}

object RandomPartCreator {
    // registry of internal factories, so Static Factory Methods
    // Set for no duplicates
    // object created by Static Factory Method has to extend `Part`
    private val partFactories = mutableSetOf<PartFactory<out Part>>()

    // adding new internal factory to the registry
    fun registerFactory(factory: PartFactory<out Part>) {
        partFactories.add(factory)
    }

    // so called generator - creates instance without any parameters passed
    fun createRandomPart(): Part {
        // random number from the registry size range
        val randomFactory = Random.nextInt(partFactories.size)
        // calling `create()` on picked factory
        // unfortunately you can't take n-th element from Set without making it a list
        return partFactories.toList()[randomFactory].create()
    }
}