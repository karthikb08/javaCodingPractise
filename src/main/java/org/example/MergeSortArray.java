import java.util.Arrays;

public class MergeSortArray {

    public static void mSort(int[] arr, int start,int end,int mid){
        int[] crr = new int[arr.length];
        int i=start;
        int j=mid;
        int k=start;

        while(i < mid && j < end){

            if(arr[i] < arr[j]){
                crr[k] = arr[i];
                i++;
                k++;
            }
            else {
                crr[k] = arr[j];
                j++;
                k++;
            }

        }

        while(i < mid){
            crr[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            crr[k] = arr[j];
            j++;
            k++;
        }

       for(int itr=start;itr < end;itr++){
           arr[itr] = crr[itr];
       }
    }

    public static void mergeSort(int[] arr,int start,int end){
        if(end-start ==1)
            return;
        int mid = (start + end) /2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        mSort(arr,start,end,mid);
    }

    public static void main(String[] args) {

        int[] arr = {30,40,50,70,10,60,20,80};
        //int[] brr ={10,60,20,80};
        int start=0;
        int end=arr.length;
        //int mid = (start+end)/2;
        //Arrays.toString(mSort(arr,start,end,mid));
        mergeSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

}
