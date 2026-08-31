import static java.util.Arrays.*;

public class MergeSort {
    //Use two pinter here and efficient way
    //use i,j,k
    //k as placed  last element
    //i = m-1 and j = n-1

    public  static  void reverseArray(int[] nums){
        int i=0;
        int j = nums.length-1;
        int t;
        while(i < j){

            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;

            i++;
            j--;;
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums3 = new int[m+n];

        //sort(nums1);
        reverseArray(nums1);
        sort(nums2);
        for(int i=0;i<m;i++){
                nums3[i] = nums1[i];
        }

        for(int j=0;j<n;j++){
            nums3[m++] = nums2[j]; // logical thinking
        }
        sort(nums3);
        for(int k=0;k<nums3.length;k++){
            System.out.println(nums3[k]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,1,0,0,0};
        nums1= stream(nums1).filter(num->num!=0).toArray();
        int[] nums2 = {6,5,4};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);

    }
}

