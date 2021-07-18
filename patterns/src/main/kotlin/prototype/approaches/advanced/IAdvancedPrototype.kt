package prototype.approaches.advanced


interface IAdvancedPrototype {
    fun shallowClone(): IAdvancedPrototype
    fun deepClone(): IAdvancedPrototype
}