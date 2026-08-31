import  java.util.*;

public class Angaram {

    public static void main(String args[]){

        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> map= new HashMap<>(); // key,values
        for(String s: strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);

            String s1 = String.valueOf(ch);

            if(!map.containsKey(s1)){
                map.put(s1, new java.util.ArrayList<>());
            }
            map.get(s1).add(s);
        }
        System.out.println("Anagram" + new ArrayList<>(map.values()));
    }
}
