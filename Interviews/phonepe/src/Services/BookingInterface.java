package Services;

import Models.City;
import Models.Vehicle;
import Models.VehicleType;

public interface BookingInterface {
    Vehicle bookVehicle(VehicleType vehicleType,int start, int end);
}
