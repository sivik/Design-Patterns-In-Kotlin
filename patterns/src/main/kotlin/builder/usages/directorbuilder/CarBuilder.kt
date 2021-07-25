package builder.usages.directorbuilder

class CarBuilder : VehicleBuilder()
{
    init {
        vehicle = Vehicle("Car")
    }

    override fun buildDoors() {
        vehicle["doors"] = "4"
    }

    override fun buildEngine() {
        vehicle["engine"] = "2500 cc"
    }

    override fun buildFrame() {
        vehicle["frame"] = "Car Frame"
    }

    override fun buildWheels() {
        vehicle["wheels"] = "4"
    }
}