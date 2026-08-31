import java.util.Arrays;
import java.util.List;

public class smallestPositiveNumber {
    public static void main(String[] args) {
        int[] arr= {2,-3,4,1,1,7};

        List<Integer> list = Arrays.stream(arr).filter(x-> x > 0).distinct().boxed().sorted().toList();

        System.out.print(list);

        int expected =1;

        for(int x : list){
            if(x==expected){
                expected++;
            }else if(x > expected){
                break;
            }
        }
        System.out.println(" \n" + expected);
    }
}
