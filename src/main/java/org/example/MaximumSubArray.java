public class MaximumSubArray {
    // Kandane's Alog
    public static void main(String args[]){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        //int[] arr = {-2, -3, 8, -7, -1, 2, 3};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];

            if (currentSum > maxSum) { //current sum greater than maxsum
                maxSum = currentSum;
            }

            if (currentSum < 0) { //current sume less than 0 then reset
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }


}

//
//public class MaximumSubArray extends Addition implements Special {
//    public static void main(String[] args) {
//        System.out.println(new MaximumSubArray().add());
//    }
//
//    int add() {
//        return --foo + bar--;
//    }
//}
//
//class Addition {
//    int foo = 1;
//}
//
//interface Special {
//    int bar = 1;
//}
