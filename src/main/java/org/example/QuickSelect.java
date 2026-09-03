package org.example;

public class QuickSelect {
    public static void main(String[] args) {

        //int[] arr= {12, 3, 5, 7, 19};
        //int[] arr= {3,2,1,5,6,4}; k=2;
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k=4;

        int targetIndex = arr.length - k ; //n-k//random

        int result = quickSelect(arr, targetIndex);

        System.out.print("Result: " + result);

    }

    public static int quickSelect(int[] arr, int targetIndex) {
        if (arr.length == 0) return -1; // guard
        if (arr.length == 1) return arr[0]; // base case

        //left and right count for the array index checking

        // Step1: Choose pivot (middle element)
        int pivot = arr[arr.length / 2];

        // Step2: Partition
        int leftCount = 0, rightCount = 0, equalCount=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot)
                leftCount++;
            else if (arr[i] > pivot)
                rightCount++;
            else
                equalCount++;
        }
        //allocate the arrays for the left and right side
        int[] left = new int[leftCount];
        int[] right = new int[rightCount];
        int l = 0, r = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < pivot)
                left[l++] = arr[j];
            else if (arr[j] > pivot)
                right[r++] = arr[j];
        }

        // Step3: Pivot range
        int pivotStart = left.length;
        int pivotEnd = pivotStart + equalCount - 1;

        System.out.println("Pivot=" + pivot + ", PivotRange=[" + pivotStart + "," + pivotEnd + "], TargetIndex=" + targetIndex);

        // Step4: Compare
        if (targetIndex >= pivotStart && targetIndex <= pivotEnd) {
            return pivot; // target lies inside pivot group
        } else if (targetIndex < pivotStart) {
            return quickSelect(left, targetIndex);
        } else {
            return quickSelect(right, targetIndex - pivotEnd - 1);
        }

    }
}

