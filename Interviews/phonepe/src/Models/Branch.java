package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Branch {
    String name;
    HashMap<VehicleType, List<Vehicle>> vehicles;
    HashMap<VehicleType, Integer> prices;
    public void addPrice(VehicleType vehicleType,int price)
    {
        prices.put(vehicleType,price);
    }
    public int getPrice(VehicleType vehicleType)
    {
        if(prices.get(vehicleType)==null)
            return -1;
        return this.prices.get(vehicleType);
    }
    public void addVehicle(VehicleType vehicleType,Vehicle vehicle)
    {
        List<Vehicle> list=this.vehicles.get(vehicleType);
        if(list==null)
            list=new ArrayList<>();
        list.add(vehicle);
        this.vehicles.put(vehicleType,list);
    }
    public List<Vehicle> getVehicles(VehicleType vehicleType)
    {
        return this.vehicles.get(vehicleType);
    }

    public Branch(String name) {
        this.name = name;
        this.vehicles= new HashMap<VehicleType, List<Vehicle>>();
        this.prices=new HashMap<>();
    }
}


//branch_vehicle_mapping
{
    id
        branch_id
            vehicle_id
                vehicle_type_id
        }
        branch
        {

        }
       branch_price_mapping
        {
            id
        branch_id
        vehicle_type_id
        price
        }
        vehicle
        {

        }
        vehicle_booking_mapping
        {
            id,
            vehicle_id
            slot_id
        }
        city
        {

        }
        booking_slots
        {
            id
            time
        }