package Models;

public enum VehicleType {
    SEDAN("Vasanth Vihar"),
    HATCH_BACK("CP"),
    SUV("SUV"),
    ;

    public final String vehicleType;


    VehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
