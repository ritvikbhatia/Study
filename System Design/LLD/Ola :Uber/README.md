# OLa LLD

/*
———————————— LLD———————————————

Problem Statement:
We want to build a cab booking platform to allow a rider to book a cab.

Details:
* The location is represented as a (x, y) coordinate.
* Distance between two points (x1, y1) and(x2, y2) is sqrt((x1-x2)^2 + (y1-y2)^2)
* Platform has decided upon maximum distance a driver has to travel to pickup a rider.
* A cab has only 1 driver.
* Sharing of cab is not allowed between riders
* There is a single type of cab

Please build an application that exposes following features to riders and drivers.
* Register a rider.
* Register a driver/cab
* Update a cab's location
* A driver can switch on/off his availability
* A rider can book a cab
* Fetch history of all rides taken by a rider.
* End the Trip

actors : rider , driver 
Cab
Location
Ride

Design Patterns : 
Builder Pattern for creating person object;


class Structure : 
Class Person
{
    String name
    Account account;
    List<Rides> bookings;
    fetchBookings();
}
Class Account
{
    int phone;
    String Email
    String username
    String password
}
class Admin extends Person
{
    registerDriver();
}
Class Rider extends Person
{
    bookCab(Location source,Location destination)
}
Class Driver extends Person
{
    Earnings earnings;
    registerCab(Cab cab)
}
Class Ride
{
    Location source;
    Location Destination;
    Booking booking
    Cost cost;
    Status rideStatus; 
}
class Booking
{
    id 
    Location source
    Location Dest
    Cost upfront
    Rider 
    Driver
}
enum Status
{
    CANCELLED , UPCOMING , COMPLETED
}
class Location
{
    float x
    float y
}
class Cab
{
    vehicle id 
    licence id 
    registration number
    Location
    Availability
    Driver driver;
    switchAvailability()
}
enum Availabiliy
{
    ON,OFF
}

API design :
POST user/login
{
    username , pass
}
POST users/driver
{
    driver details
}
POST users/rider
{
    rider details
}
POST bookings
{
    source 
    dest 
    rider id
}
GET bookings?status
{

    
}

route.get("/upcomngbookings",getUpcomingBookings)

async getUpcomingBookings(req,res)
{
    try{
    var  bookings= await sql.get(bookings,{status:"upcoming"})
    if(bookings.length==0)
        res.send(404);
    res.send(200,bookings);
    }
    catch(e)
    {
        console.log(e);
        res.send(500);
    }

}

GET rides?status

POST driver/cabs
{
    cab details
    driver id
}

PUT driver/cabs/{id}/status
{
    availabuility
}


DB Design :
user
{
    id,
    name ,
    email 
    ,phone,
    hash,
    type
}
cab
{
    id , registration no, licence no, driver_id,avail_status
}
trip
{
    id , 
    booking_id
    source,
    dest,
    rider_id
    cab_id
    cost
    status
}
bookings
{
    id, 
    src,
    dest,
    cost
}



 
