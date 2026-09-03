package org.example;

public class BinarySearch {

    private static void binarySearch(int[] arr, int key){
        int low=0,high= arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                System.out.println("Target value is : " + key);
                return;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            //System.out.println("Target:" + arr[mid]);
        }
    }

    public static void main(String[] args) {
      int[] arr = {10,20,30,40,50,60,70};
      int key = 60;
      binarySearch(arr, key);
    }
}
