public class Main {
    public static void main(String[] args) {
        int[] arr={3,1,4,2,5};
       sortMinMoves(arr);
    }
    public static void sortMinMoves(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                int ele1 = -1, ele2 = -1;
                if (arr[j] == i) {
                    ele1 = j;
                }
                if (arr[j] == (int)(i+1)) {
                    ele2 = j;
                }
                System.out.println("1st "+i+" 2nd "+(int)(i+1));
                if (ele1!=-1&&ele2!=-1&& ele1> ele2) {
                    System.out.println("move " + i + " to top");
                }
            }
        }
    }
}

//123
//323
//c=1
//c=2
//121
//323
