package Services;

import Models.Branch;
import Models.City;
import Models.Vehicle;
import Models.VehicleType;

public class InventoryService implements Inventory {
    City city=City.getCity();
    @Override
    public Branch addBranch(String branch) {
        Branch branch1=new Branch(branch);
        city.addBranch(branch1);
        System.out.println("branch created successfully "+branch1.toString());
        return branch1;
    }

    @Override
    public void allocatePrice(Branch branch, VehicleType vehicleType, int price) {
        branch.addPrice(vehicleType,price);
        System.out.println("price added Successfully "+branch.toString());
    }

    @Override
    public void addVehicle(String id, VehicleType vehicleType, Branch branch) {
        Vehicle v1=new Vehicle(id);
        branch.addVehicle(vehicleType,v1);
    }
}
