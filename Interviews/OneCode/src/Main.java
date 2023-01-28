import java.util.*;
/*Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
* You must not modify the array (assume the array is read only).
* You must use only constant, O(1) extra space.
* Your runtime complexity should be less than O(n2).
* There is only one duplicate number in the array, but it could be repeated more than once.*/

/* Q2Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
path= "../" =>""
path="a/./b/"=>a/b
*/


class Solution {

    public int solution(String s) {
        // write the solution here..
        return 0;
    }
    public static int findDuplicate(int arr[])
    {
        int slow=0,fast=1;
        while(arr[slow]!=arr[fast]&&fast!=slow)
        {
            slow=arr[slow];
            fast=arr[arr[fast]];
        }
        return arr[slow];
    }
    public static String absoluteURL(String s)
    {
        String arr[]=s.split("/");
        Stack<String> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(".")||arr[i].equals(""))
                continue;
            else if(arr[i].equals("..")&&st.size()>0)
                st.pop();
            else
                st.push(arr[i]);
            System.out.println(st);
        }
        String ans="";
        while(st.size()>0&&!st.peek().equals(".."))
        {
            ans=st.pop()+"/"+ans;
        }
        if(ans.length()>0)
        {
            ans=ans.substring(0,ans.length()-1);
            ans="/"+ans;
        }
        return ans;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        // int arr[]={1,3,3,2,4,6,5};
        String s="/../";
        // int ans = new Solution().findDuplicate(arr);
        String ans = new Solution().absoluteURL(s);
        System.out.println(ans);
    }
}