import java.util.Arrays;

public class antiClockWise {

    private static void reverseOrder(int[] arr, int start, int end){
        //.int temp;
        while(start < end)
        {
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end]= temp;
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] ip = {1,2,3,4,5,6};
        int d = 2;
        int n = ip.length;
        // Step 1: reverse first block (0..d-1)
        reverseOrder(ip, 0, d-1);

        // Step 2: reverse second block (d..n-1)
        reverseOrder(ip, d, n-1);

        // Step 3: reverse entire array (0..n-1)
        reverseOrder(ip, 0, n-1);
        System.out.println(Arrays.toString(ip));
    }

}
