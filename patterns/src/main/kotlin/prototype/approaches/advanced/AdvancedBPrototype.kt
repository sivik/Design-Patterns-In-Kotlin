package prototype.approaches.advanced

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class AdvancedBPrototype : IAdvancedPrototype, Cloneable {

    override fun shallowClone(): IAdvancedPrototype {
        return this.clone() as AdvancedBPrototype
    }

    override fun deepClone(): IAdvancedPrototype {
        val json = Gson().toJson(this)
        val collectionType = object : TypeToken<AdvancedBPrototype>() {}.type
        return Gson().fromJson(json, collectionType)
    }
}