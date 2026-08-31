import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayExample {
    public static void main(String args[]) {

        //Print the unique number
        //List<Integer> numbers = Arrays.asList(1,2,2,3,3,4,4,5,5,6,6);
        //List<Integer> unique = new ArrayList<>(new LinkedHashSet<>(numbers));
        //System.out.println("Unique"+ unique);
        //String str[] = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        //System.out.println(str.length);
        //System.out.println(str[0].split(",").length);

        //O(1)
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                result = i;
            }
        }
        System.out.println("Array of Index: " + result);


        //Array Practise
        int[] arrayNum = {1, 2, 5, 6, 9, 10};

        System.out.println("Before Array Size:" + arrayNum.length);

        arrayNum = new int[arrayNum.length + 1];

        System.out.println("After Array Size:" + arrayNum.length);

        int value = 20;
        int index =5;

        for(int i=0;i<arrayNum.length;i++){
            arrayNum[arrayNum.length-1] = 20;
            System.out.println("Add index:" + i);
            System.out.println("Add index:" + arrayNum[i]);
        }



    }
}
