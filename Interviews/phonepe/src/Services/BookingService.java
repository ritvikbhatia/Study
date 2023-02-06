package Services;

import Models.Branch;
import Models.City;
import Models.Vehicle;
import Models.VehicleType;

import java.util.Comparator;
import java.util.List;

public class BookingService implements BookingInterface {
    City city =City.getCity();
    @Override
    public Vehicle bookVehicle(VehicleType vehicleType,int start, int end) {
        List<Branch> branches=city.getBranches();
       branches.sort((a, b) -> {
           if(a.getPrice(vehicleType) ==-1){
               return 1;
           }

           return (int) (a.getPrice(vehicleType) - b.getPrice(vehicleType));
       });
       for (Branch b:branches)
       {
           List<Vehicle> vehicleList=b.getVehicles(vehicleType);
           for(Vehicle v:vehicleList)
           {
               if(v.isAvailable(start,end))
               {
                   v.bookSlot(start,end);
                   return v;
               }
           }
       }
        return null;
    }
}
