OLA / UBER HLD

other links

https://www.codekarle.com/system-design/Uber-system-design.html

https://www.educative.io/blog/uber-backend-system-design

https://www.geeksforgeeks.org/system-design-of-uber-app-uber-system-architecture/

It has 2 parts : customer side and driver side 
ask interviewer which one you want.


Functional Requirements:
1. user can login/signup
   POST users/login
   POST user/signup
2. user can book a cab
3. before booking it should show available options with prices.
4. after ride completes , payment should be done.
5. should provide support to customers.
6. location should be provided thoughout the journey ,( map service )
7. should be able to fetch past bookings

Non functional requirements:
1. It should be highly available.
2. Should be fault tolerant.
3. should have low latency.
4. should be scalable./ handle high scale 

capacity estimation :
Read/write ratio 3:2 
1cr requests per day.
6940 requests per-minute

2* lat long + cab type and misc
{approx) 50byte

throughput: 6940*50
38250 bytes/sec
38 mbps

![ola uber try 1 drawio](https://user-images.githubusercontent.com/41165330/213901895-ba42fc0a-3ed2-48ed-84d6-387e1b5ebdbf.png)


first try 

# in interview of physics wallah
//Design OLA


Functional Requirements 

Customer 
A customer enter location and destination ,-> available rides 
Customer suitable ride and make a booking 
Customer can track the ride

Partner 
Partner can accept bookings
Partner can see customers location at all times 

Payment flow 

Non Functional Requirements
Should be highly available 
Global 
Fault tolerant 
Low latency 
Consistent 

Capacity estimation 

21 rpm 
50 bytes 
17kbps 
Read : write 4:1 
7TB data for 5 years 




POST bookings ->booking 
{
	Source , destination , user id , vehicle_type
}
Get bookings?time=past

→ bookings 

POST payments/{transaction_id}
{

}

POST bookings/{booking_id}/accept
{
User_id,
}

GET requests?location

{
}

GET driver?geohash_id
[]

POST rides/broadcast
{
ride _id 
drivers=[]
}


DB 

User 
{
Id,
Name , 
Number , 
Email ,
}
Ride
{
Id,
Requester_id,
Source_id,
Destination_id,
vehicle_id
}
Vehicle
{
Id,
NAME,
}
Bookings
{
Id,
Ride_id
,driver_id,
status
}


![image](https://user-images.githubusercontent.com/41165330/214552059-0a1d5752-28ed-47de-88dc-c72752ae8087.png)


------------------------------------------------------------------------------------------------------------------------------------  
#insights After seeing solutions:

should focus more on how matching algo works.

There are two kinds of users that our system should account for: Drivers and Customers.


Functional requirements:
1. Drivers must be able to frequently notify the service regarding their current location and availability
2. Passengers should be able to see all nearby drivers in real-time
3. Customers can request a ride using a destination and pickup time.
4. Nearby drivers should be notified when a customer needs to be picked up.
5. Once a ride is accepted, both the driver and customer must see the other’s current location for the entire duration of the trip.
6. Once the drive is complete, the driver completes the ride and should then be available for another customer.

NFR missed :
1.Reduce extra driving.
2.Minimum waiting time
3.Minimum overall ETA

We’ll design our build with the following constraints and estimations:

300 million customers and one million drivers in the system
One million active customers and 500 thousand active drivers per day
One million rides per day
All active drivers notify their current location every three seconds
System contacts drivers in real time when customer puts in a ride request

![image](https://user-images.githubusercontent.com/41165330/213904841-45bc666e-f84f-4c48-85f2-5a91acdf17a6.png)

from educative

quad tree approach and more about quad trees
https://www.educative.io/answers/what-is-a-quadtree-how-is-it-used-in-location-based-services


![image](https://user-images.githubusercontent.com/41165330/213906049-451ed9cb-f31c-45df-a091-8e82a130eb81.png)

code karle
