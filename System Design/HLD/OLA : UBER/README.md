OLA / UBER HLD

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




 


