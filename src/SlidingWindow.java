public class SlidingWindow {
    public static void main(String[] args) {

        int[] arr = {2,1,5,1,3,2};
        int k=3;
        int res = slidingWindowFind(arr,k);
        System.out.println("Max Sliding window = "+ res);
    }

    private static int slidingWindowFind(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for(int j=k;j<n;j++){

           windowSum += arr[j] - arr[j-k];
           maxSum = Math.max(windowSum,maxSum);
        }
        return maxSum;
    }
}
