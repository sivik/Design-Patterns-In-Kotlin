package builder.usages.simplebuilder

class Computer(compBuild: ComputerBuilder) {

    private val cb: ComputerBuilder = compBuild

    fun build(): String {
        return ("The required configuration is :" +
                "OS : ${cb.getOS()} " +
                "RAM : ${cb.getRAM()} " +
                "screenSize : ${cb.getScreenSize()} " +
                "externalMouse : ${cb.getExternalMouse()} " +
                "battery : ${cb.getBattery()}")
    }
}