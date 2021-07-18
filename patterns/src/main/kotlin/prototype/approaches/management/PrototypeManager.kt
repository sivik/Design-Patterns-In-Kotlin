package prototype.approaches.management

import prototype.approaches.advanced.AdvancedAPrototype
import prototype.approaches.advanced.AdvancedBPrototype
import prototype.approaches.advanced.IAdvancedPrototype
import prototype.approaches.simple.ISimplePrototype
import prototype.approaches.simple.SimpleAPrototype
import prototype.approaches.simple.SimpleBPrototype

class PrototypeManager() {
    private val prototypes = HashMap<String, IAdvancedPrototype>()
    private val simplePrototypes = HashMap<String, ISimplePrototype>()

    init {
        preparePrototypes()
        prepareSimplePrototypes()
    }

    private fun preparePrototypes() {
        prototypes["prototypeA"] = AdvancedAPrototype()
        prototypes["prototypeAVariant2"] = AdvancedAPrototype()
        prototypes["prototypeB"] = AdvancedBPrototype()
        prototypes["prototypeBVariant2"] = AdvancedBPrototype()
        //here some very advanced setups goes
    }

    private fun prepareSimplePrototypes() {
        simplePrototypes["simplePrototypeA"] = SimpleAPrototype()
        simplePrototypes["simplePrototypeB"] = SimpleBPrototype()
        //here some very simple setups goes
    }

    fun getCloneAPrototype(key: String): AdvancedAPrototype {
        println("Get clone: AdvancedAPrototype")
        return (prototypes[key])?.shallowClone() as AdvancedAPrototype
    }

    fun getDeepCloneAPrototype(key: String): AdvancedAPrototype {
        println("Get deep clone: AdvancedAPrototype")
        return (prototypes[key])?.deepClone() as AdvancedAPrototype
    }

    fun getCloneBPrototype(key: String): AdvancedBPrototype {
        println("Get clone: AdvancedBPrototype")
        return (prototypes[key])?.shallowClone() as AdvancedBPrototype
    }

    fun getDeepCloneBPrototype(key: String): AdvancedBPrototype {
        println("Get deep clone: AdvancedBPrototype")
        return (prototypes[key])?.deepClone() as AdvancedBPrototype
    }

    fun getCloneSimpleAPrototype(key: String): SimpleAPrototype {
        println("Get clone: SimpleAPrototype")
        return (simplePrototypes[key])?.simpleClone() as SimpleAPrototype
    }

    fun getCloneSimpleBPrototype(key: String): SimpleBPrototype {
        println("Get clone: SimpleBPrototype")
        return (simplePrototypes[key])?.simpleClone() as SimpleBPrototype
    }

}

fun main() {
    PrototypeManager().apply {
        getCloneAPrototype("prototypeAVariant2")
        getDeepCloneAPrototype("prototypeA")

        getCloneBPrototype("prototypeBVariant2")
        getDeepCloneBPrototype("prototypeB")

        getCloneSimpleAPrototype("simplePrototypeA")
        getCloneSimpleBPrototype("simplePrototypeB")

    }
}