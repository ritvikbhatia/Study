import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        String[] arr={"3","1","9999","5","9","852"};
//        System.out.println( maxNumber(arr));
        System.out.println(pascal(6));
    }

//    [[1],[1,1],[1,2,1],[1,3,3,1]]

    public static ArrayList<ArrayList<Integer>> pascal(int level)
    {
        if(level==1) {
            ArrayList<Integer> inner = new ArrayList<>();
            inner.add(1);
            ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
            outer.add(inner);
            return outer;
        }
        else
        {
           ArrayList<ArrayList<Integer>> smallAns=pascal(level-1);
           ArrayList<Integer> last=smallAns.get(smallAns.size()-1);
           ArrayList<Integer> toBeAdded=new ArrayList<>();
           //[1,2,1]
           toBeAdded.add(1);
           for (int i=1;i<last.size();i++)
           {

                   int num=last.get(i)+last.get(i-1);
                   toBeAdded.add(num);

           }
           toBeAdded.add(1);
           ArrayList<ArrayList<Integer>> ans=smallAns;
           ans.add(toBeAdded);
           return ans;

        }
    }
    public static String maxNumber(String arr[])
    {
        Arrays.sort(arr,(a,b)->{
            if(a.length()==b.length())
                return a.compareTo(b);
            else if(a.length()>b.length())
            {
                if(b.compareTo(a.substring(0,b.length()))==0)
                {
                    return a.charAt(b.length())-b.charAt(0);

                }
                return b.compareTo(a.substring(0,b.length()));
            }
            else
            {
                if(a.compareTo(b.substring(0,a.length()))==0)
                {
                    return b.charAt(a.length())-a.charAt(0);

                }
                return a.compareTo(b.substring(0,a.length()));
            }
        });
        String ans="";
        for (String i:arr)
        {
            ans=i+ans;
        }
        return ans;
    }
}
