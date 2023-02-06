package Services;

import Models.Branch;
import Models.VehicleType;

public interface Inventory {
   Branch addBranch(String Branch);
   void allocatePrice(Branch branch, VehicleType vehicleType,int price);
   void addVehicle(String id,VehicleType vehicleType,Branch branch);
}
