package builder.usages.directorbuilder

abstract class VehicleBuilder
{
    protected lateinit var vehicle: Vehicle

    val getVehicle: Vehicle
        get() = vehicle

    abstract fun buildDoors()
    abstract fun buildEngine()
    abstract fun buildFrame()
    abstract fun buildWheels()
}