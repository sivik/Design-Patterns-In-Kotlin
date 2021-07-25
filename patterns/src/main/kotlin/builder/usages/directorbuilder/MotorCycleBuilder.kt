package builder.usages.directorbuilder

class MotorCycleBuilder : VehicleBuilder()
{
    init {
        vehicle = Vehicle("MotorCycle")
    }

    override fun buildDoors() {
        vehicle["doors"] = "0"
    }

    override fun buildEngine() {
        vehicle["engine"] = "500 cc"
    }

    override fun buildFrame() {
        vehicle["frame"] = "MotorCycle Frame"
    }

    override fun buildWheels() {
        vehicle["wheels"] = "2"
    }
}