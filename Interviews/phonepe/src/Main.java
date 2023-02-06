import Models.Branch;
import Models.City;
import Models.Vehicle;
import Models.VehicleType;
import Services.BookingInterface;
import Services.BookingService;
import Services.Inventory;
import Services.InventoryService;
class Solution {
    public static void main(String[] args) {
        Inventory inventoryService=new InventoryService();
        BookingInterface bookingService=new BookingService();
        Branch vasantVihar=inventoryService.addBranch("Vasant Vihar");
        Branch cyberCity= inventoryService.addBranch("Cyber City");
        inventoryService.allocatePrice(vasantVihar, VehicleType. SEDAN,100);
        inventoryService.allocatePrice(vasantVihar,VehicleType.HATCH_BACK,80);
        inventoryService.allocatePrice(cyberCity,VehicleType.SEDAN,200);
        inventoryService.allocatePrice(cyberCity,VehicleType.HATCH_BACK,50);
        inventoryService.addVehicle("DL 01 MR 9310",VehicleType.SEDAN,vasantVihar);
        inventoryService.addVehicle("DL 01 MR 9311",VehicleType.SEDAN,cyberCity);
        inventoryService.addVehicle("DL 01 MR 9312",VehicleType.HATCH_BACK,cyberCity);
        Vehicle vehicle=bookingService.bookVehicle(VehicleType.SEDAN,10,1);
        System.out.println(vehicle);

    }



}