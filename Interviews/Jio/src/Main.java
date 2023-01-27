import java.util.Stack;

public class Main {
    public static void
    main(String[] args) {
        System.out.println("Hello world!");
    }
//temp=[13,7,6,12,25,28,21]

    public  static int[] nextHighestTemperatures(int arr[])
    {
        if(arr.length==1)
        {
            int ans1[]=new int[1];
            ans1[0]=-1;
            return ans1;
        }
        //temp=[13,7,6,12,25,28,21]
        //ans=[0,0,12,12,25,28,-1,-1]
        //1
        //3
        //4
        //5

        Stack<Integer> s=new Stack<>();
        int ans[]=new int[arr.length];
        ans[arr.length-1]=-1;
        s.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[s.peek()]>arr[i])
            {
                ans[i]=arr[s.peek()];
                s.push(i);
            }
            else
            {
                while(s.size()>0&&arr[s.peek()]<=arr[i])
                {
                    int popped=s.pop();
                }
                if(s.size()==0)
                {
                    ans[i]=-1;
                }
                else {
                    ans[i]=arr[s.peek()];
                }
                s.push(i);
            }
        }
        return null;
    }
}


//ans=[25,12,12,25,28,-1,-1]
//stack
//        1
//        3
//        4
//5


//[[0,0,0]
// [0,1,0],
// [0,0,0]]

//ans(i,j)=ans(i+1,j)+ans(i,j+1)