package prototype.approaches.advanced

class AdvancedAPrototype : IAdvancedPrototype, Cloneable
{
    private lateinit var veryComplicatedObject: Any

    override fun shallowClone(): IAdvancedPrototype {
        return this.clone() as AdvancedAPrototype
    }

    override fun deepClone(): IAdvancedPrototype {
        val clone = this.clone() as AdvancedAPrototype

        // Manual object re-creation based on original one
        clone.veryComplicatedObject = Any()
        return clone
    }
}