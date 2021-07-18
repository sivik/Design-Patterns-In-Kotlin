package prototype.approaches.simple

class SimpleBPrototype : ISimplePrototype, Cloneable {
    override fun simpleClone(): ISimplePrototype {
        return this.clone() as SimpleBPrototype
    }
}