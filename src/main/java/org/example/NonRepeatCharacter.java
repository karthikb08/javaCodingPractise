import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatCharacter {
    public static void main(String args[]){
        int index = uniqueCharIndex();
        System.out.println("Unique Index:"+index);
    }

    private static int uniqueCharIndex() {
        char charCheck;
        Map<Character,Integer> opResult = new HashMap<>();

        //In string get through the keyboard
        Scanner ipString = new Scanner(System.in);
        String getString = ipString.nextLine();
        System.out.println("Entered String:" + getString);

        for(var i=0;i<getString.length();i++){
            charCheck = getString.charAt(i);
            System.out.println(charCheck);
           opResult.put(charCheck,opResult.getOrDefault(charCheck,0)+1);
        }
        System.out.println("Count for Enter String:" + opResult);
        for(var j=0;j<getString.length();j++){
            if (opResult.get(getString.charAt(j)) ==1){
                return j;
            }
        }
        return -1;
    }
}
