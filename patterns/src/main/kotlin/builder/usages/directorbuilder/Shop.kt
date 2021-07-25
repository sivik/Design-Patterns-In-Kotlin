package builder.usages.directorbuilder

class Shop
{
    fun construct(vehicleBuilder: VehicleBuilder)
    {
        vehicleBuilder.buildFrame()
        vehicleBuilder.buildEngine()
        vehicleBuilder.buildWheels()
        vehicleBuilder.buildDoors()
    }
}