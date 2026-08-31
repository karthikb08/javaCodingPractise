import java.util.*;

public class RomanLetter {
    private static final Map<Character, Integer> romanMap = new HashMap<>();
    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static void main(String[] args) {
        String output = "";
        char reverse;
        int integerValue;
        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter the Roman letters:");
        String input = inputString.nextLine();
        System.out.println("Enter the Roman letters Values are :" + input.length());


        
        //string reverse
        /*for(int i=0;i<input.length();i++){
            reverse = input.charAt(i);
            output = reverse+output;
        }
        System.out.println("Reverse Output: "+ output);*/

        int result = getRomanResult(input);
        System.out.println("Result: "+ result);

    }

    private static int getRomanResult(String input) {
        int prev=0;
        int result = 0;
        for(int i = input.length()-1; i>=0; i--){
            int curr = romanMap.get(input.charAt(i));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }
}
