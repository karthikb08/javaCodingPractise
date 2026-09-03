package org.example;

public class reverseArray {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12,14,16};

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " " + "\n");
        }

        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public  static void reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        int t;
        while(i<j){

            t = arr[i];
            arr[i] = arr[j];
            arr[j]=t;

            i++;
            j--;
        }
    }
}
