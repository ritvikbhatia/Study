Bla Bla Cars 

taken by Bar raiser for Cogo port interview

//Bla Bla Car

- Design a CarPool Application : 
Ride(src, dest, dateTime, no of seats, pricePerSeat)
Search(src, dest, day) 
Booking



- jot down and clarify requirements 
- come up with the database schema design 

requirements :
search the available rides : src ,dest ,day

Ride
{
    id
    user_id 
    source_id
    dest_id
    dateTime
    totalSeats
    availableSeats
    vehicle_id
}
vehicle
{
    id
    user_id
    licence
    model
}
address
{
    id
    country_id
    state_id
    place 
}
country
{
    id 
    name
}
state
{
    id
    name
    country_id
}
seats
{
    id
    price
    ride_id
    is-booked
    user_id
}
user
{
    id
    name 
    email 
    number
}
Booking
{
    id
    ride_id
    user_id
    payment
    no_of_seats
}

api Design

endpoint
http method
request/resp.

RIDE : GET rides/from/{source}/to/{dest}/on/{day}?from={}
Booking : POST rides/book
{
    user_id
    ride_id
    no_of_seats
}
Booking POST rides
{
    user_id
    s_country_id 
    s_state_id
    s_place
    d_place
    price
    number_of_seats
    dateTime
    vehicle_id
}

RIDE : GET rides/{ride_id}

Booking: PUT rides/{ride_id}{
    user_id
    s_country_id 
    s_state_id
    s_place
    d_place
    price
    number_of_seats
    dateTime
    vehicle_id
}
RIDE : POST rides/share
{
    email
    ride_id
}

- Come up with high level design 
NFRs : 
10 million rides creation
40 millions searches daily basis 
50bytes
read : write 1:4 
10 milion per 
10 million /24*60*60
116 rides/sec




Functional requirements
users can create ride 
other users can search and select a ride 




![image](https://user-images.githubusercontent.com/41165330/214003828-79e001b6-9191-4600-9800-76073b2c2aa4.png)

feedback received :

tell cardinality on your own 1:N , N:M etc
add load balancers on services as well
could have used workers for adding to elastic search 
query params instead of path params 
