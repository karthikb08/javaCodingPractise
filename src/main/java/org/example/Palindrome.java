import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String args[]){
        String palind= "madam";
        //String reverse = new StringBuilder(strin)

        //palind.stream().filter(palind ->palind.startswith("m")).forEach(System)

        //for(int i=0;i<)
        //palind.charAt(i)
        //palind.length()
        //palind.getChar(i)==palind.getcharAt(palind.)
        java.util.List<String> results = palind.chars().mapToObj(c ->String.valueOf((char) c)).collect(Collectors.toList());
        java.util.Collections.reverse(results);
        results.forEach(System.out::print);

       // palind.chars().forEach(c -> System.out.println((char) c));
        String reversed = String.valueOf(new java.util.ArrayList<>());
        for (int i = palind.length() - 1; i >= 0; i--) {
            reversed =reversed +  results.get(i);
        }
        System.out.println("\n Reversed= " +reversed);

        //int to Stream
        int value = 42;
        java.util.stream.IntStream.of(value).forEach(System.out::println);

        //int to Array Stream
        int[] vals = {13,43,23};
         java.util.Arrays.stream(vals).forEach(System.out::println);

        int[] vals1 = {13,43,23};
        java.util.List<Integer> listInt = java.util.Arrays.stream(vals1)
                .boxed()
                .collect(java.util.stream.Collectors.toList());
        listInt.forEach(System.out::println);


    }
}

