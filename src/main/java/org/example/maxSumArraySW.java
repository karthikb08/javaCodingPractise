public class maxSumArraySW {
    public static void main(String[] args) {

        int wSum=0;
        int mSum = Integer.MIN_VALUE;
        int[] arr ={2,9,31,-4,21,7};
        int k=3;
        for(int i=0;i<k;i++){
            wSum = wSum + arr[i];
        }
        for(int i=k;i<arr.length;i++){
            wSum = wSum - arr[i-k]+arr[i]; // arr first element remove and add the last one in i
            mSum = Math.max(mSum,wSum);
        }
        System.out.println("Max Sum Sub Array " + mSum);
    }
}
