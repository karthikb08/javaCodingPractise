import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraySquare {
    public static void main(String[] args) {
//        int k = 15623;
//
//        int sum = String.valueOf(k)
//                .chars().map(c->c-'0').sum();
//        System.out.println(sum);

        int[] arr = {2,3,4,9,16,5,25,10};
        int num;
        ArrayList<Integer> listNumber= new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            listNumber.add(arr[i]);
        }

        Map<Integer,Integer> numbers = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            num = arr[i] * arr[i];
                    if(listNumber.contains(num)){
                        numbers.put(arr[i],num);
                    }
        }
        System.out.print("Match" + numbers);
    }


}
