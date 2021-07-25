package builder.usages.simplebuilder

open class ComputerBuilder {
    private var os: String? = null
    private var ram: Int? = null
    private var screenSize: Double? = null
    private var externalMouse: Boolean? = null
    private var battery: String? = null

    fun setOS(OS: String) {
        this.os = OS
    }

    fun getOS(): String? {
        return this.os
    }

    fun setRAM(RAM: Int) {
        this.ram = RAM
    }

    fun getRAM(): Int? {
        return this.ram
    }

    fun setScreenSize(screenSize: Double) {
        this.screenSize = screenSize
    }

    fun getScreenSize(): Double? {
        return this.screenSize
    }

    fun setExternalMouse(externalMouse: Boolean) {
        this.externalMouse = externalMouse
    }

    fun getExternalMouse(): Boolean? {
        return this.externalMouse
    }

    fun setBattery(battery: String) {
        this.battery = battery
    }

    fun getBattery(): String? {
        return this.battery
    }
}