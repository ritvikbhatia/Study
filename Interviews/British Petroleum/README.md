#BP

Round 1:
Graph question , solution present

Round 2:
Design LRU cache
 
import javax.xml.stream.events.StartDocument;

/*
 * Click `Run` to execute the snippet below!

 Build a cache data structure which implements the follwoing eviction policy:

1) evict an expired item if it exists
2) otherwise evict the least recently used item of the lowest priority

C= new Cache(5)
C.Set(Key='A', value=5, priority=5, expiration=10001)/
C.Set(Key='B', value=4, priority=1, expiration=40006)/
C.Set(Key='C', value=3, priority=5, expiration=10001)
C.Set(Key='D', value=2, priority=9, expiration=500) /
C.Set(Key='E', value=1, priority=5, expiration=10004)/  
C.Get('C')

// Current Time= 900 system.get_curent_time()

C.Set(Key='F', value=18, priority=5, expiration=5001)
C.Set(Key='G', value=9, priority=5, expiration=5004)
C.Set(Key='H', value=1, priority=5, expiration=5009)
C.Set(Key='I', value=1, priority=5, expiration=5011)
C.Set(Key='C', value=1, priority=5, expiration=5021)
 */


class Node
{
  int key; "E"
  int value; 
  Node next; "A"
  Node prev; "C"
  int expirationTime;
}


X:5
priorities Get-> start,end

x.next=start
start.prev=x

priority -> min heap
{
  5
}

min heap -><Node> expiryTime min heap
{
  
}


5
[0,1,2,3,4,5]

values->hashmap(key ,value)
values->{"I":1,'A":5}
priorities->hashmap(priority : Pair(startNode,endNode))
{5:
{key:I
value 1
prev :null
next:Ith address
expirationTime:,
{key:I
value 1
prev :A's address
next:null
expirationTime:}
}

5: A : I

node 
node.prev.next=node.next
