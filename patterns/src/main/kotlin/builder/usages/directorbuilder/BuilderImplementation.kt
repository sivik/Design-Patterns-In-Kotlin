package builder.usages.directorbuilder

import java.io.Console


fun main() {
    var builder: VehicleBuilder

    // Create shop with vehicle builders
    val shop = Shop()

    // Construct and display vehicles
    builder = ScooterBuilder()
    shop.construct(builder)
    builder.getVehicle.show()

    builder = CarBuilder()
    shop.construct(builder)
    builder.getVehicle.show()

    builder = MotorCycleBuilder()
    shop.construct(builder)
    builder.getVehicle.show()

    // Wait for user
    readLine()
}