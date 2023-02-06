package Models;

public class Vehicle {
    private String id;

    int [] bookingTime;

    public Vehicle(String id) {
        this.id = id;
        this.bookingTime=new int[24];
    }

    public boolean isAvailable(int t1,int t2)
    {
        if(t1<t2||t1<0||t2<0||t1>23||t2>23) {
            System.out.println("invalid time");
            throw new RuntimeException();
        }
        for (int i=t1;i<t2;i++)
        {
            if(this.bookingTime[i]==1)
                return false;
        }
            return true;
    }
    public void bookSlot(int t1,int t2)
    {
        if(t1<t2||t1<0||t2<0||t1>23||t2>23) {
            System.out.println("invalid time");
            throw new RuntimeException();
        }
        for (int i=t1;i<t2;i++)
        {
            bookingTime[i]=1;
        }
    }



}
