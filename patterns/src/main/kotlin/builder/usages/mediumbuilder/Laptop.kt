package builder.usages.mediumbuilder

class Laptop private constructor(
    val ram: String? = null,
    val os: String? = null,
    val processor: String? = null,
    val disk: String? = null
) {

    data class Builder(
        private var ram: String? = null,
        private var os: String? = null,
        private var processor: String? = null,
        private var disk: String? = null
    ) {
        fun setRam(ram: String) = apply { this.ram = ram }
        fun setOs(os: String) = apply { this.os = os }
        fun setProcessor(processor: String) = apply { this.processor = processor }
        fun setDisk(disk: String) = apply { this.disk = disk }
        fun build() = Laptop(ram, os, processor, disk)
    }

    class KotlinStyleBuilder() {
        private var ram: String? = null
        private var os: String? = null
        private var processor: String? = null
        private var disk: String? = null

        constructor(init: KotlinStyleBuilder.() -> Unit) : this() {
            init()
        }

        fun ram(ram: () -> String) {
            this.ram = ram()
        }

        fun os(os: () -> String) {
            this.os = os()
        }

        fun processor(processor: () -> String) {
            this.processor = processor()
        }

        fun disk(disk: () -> String) {
            this.disk = disk()
        }

        fun build() = Laptop(ram, os, processor, disk)
    }

    fun showConfig() =
        "The laptop configuration -> Ram : $ram , OS : $os , Processor : $processor , Disk : $disk "

}