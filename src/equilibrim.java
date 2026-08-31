public class equilibrim {
    public static int equlibrim(int[] arr, int n){
        int lSum=0;
        int rSum=0;
        for(int itrRS=0;itrRS<n;itrRS++){
            rSum = rSum + arr[itrRS];
        }
        for(int j =0;j<n;j++){
            rSum = rSum - arr[j];
            if(lSum==rSum){

                return arr[j];
            }
            lSum = lSum + arr[j];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        //int[] arr = {3,4,8,-9,20,6};

        //int[] arr = {1,3,5,2,2};
        int n = arr.length;
        int result = equlibrim(arr,n);
        System.out.println("Equlibrim index=" + result);
    }
}
