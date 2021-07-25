package builder.usages.directorbuilder

class ScooterBuilder() : VehicleBuilder()
{
    init {
        vehicle = Vehicle("Scooter")
    }

    override fun buildDoors() {
        vehicle["doors"] = "0"
    }

    override fun buildEngine() {
        vehicle["engine"] = "50 cc"
    }

    override fun buildFrame() {
        vehicle["frame"] = "Scooter Frame"
    }

    override fun buildWheels() {
        vehicle["wheels"] = "2"
    }
}