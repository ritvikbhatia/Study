public class dp {
    public static int noOfUniquePaths(int arr[][],int i,int j,int dp[][])
    {


        //[[0,0,0]
        // [0,0,1],
        // [0,0,0]]


        //[[3,1,0]
        // [2,1,0],
        // [1,1,1]]


        if(i>arr.length||j>arr[0].length)
            return 0;
        if(dp[i][j]!=-1)
            return arr[i][j];
        if(arr[i][j]==1)
            return 0;
        if(i==arr.length-1&&j==arr[0].length-1)
            return 1;
        dp[i][j]=noOfUniquePaths(arr,i+1,j,dp)+noOfUniquePaths(arr,i,j+1,dp);
        return dp[i][j];
    }
}
