public class Main {
    public static void main(String[] args) {
        System.out.println(maxPalindrome("123",3));

    }
    public static String maxPalindrome(String s,int c)
    {
        int l=0,r=s.length()-1;
        char ans[]=new char[s.length()];
        while(l<=r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                ans[l]=s.charAt(l);
                ans[r]=s.charAt((r));
            }
            else
            {
                if(s.charAt(l)>s.charAt(r))
                {
                    ans[l]=s.charAt(l);
                    ans[r]=s.charAt(l);
                }
                else
                {
                    ans[l]=s.charAt(r);
                    ans[r]=s.charAt(r);
                }
                c--;
            }
            l++;
            r--;
        }
        l=0;
        r=s.length()-1;
        while(l<=r)
        {
            if(s.charAt(l)==s.charAt(r)&&ans[l]!='9')
            {
                if(c>=2)
                {
                    ans[l] = '9';
                    ans[r] = '9';
                    c=c-2;
                }
                if(l==r&&c>=1)
                {
                    ans[l]='9';
                }
            }
            else
            {
                if(c>=1&&ans[l]!='9')
                {
                    ans[l]='9';
                    ans[r]='9';
                    c--;
                }
            }
            l++;
            r--;
        }
        System.out.println("c left = "+c);
        return new String(ans);
    }
}

//123
//323
//c=1
//c=2
//121
//323
