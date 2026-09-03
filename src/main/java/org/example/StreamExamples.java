package org.example;

import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StreamExamples {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        //int arr[]={4,5,6,7,10,4,3,3,22,3,33};
        int arr[]={4,8,5,12,10,15,19,16,24,36,38};

//        List<Integer> arrayList = new ArrayList<Integer>();
//
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.add(40);
//        arrayList.add(40);
//        arrayList.add(5);

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("abc");
        stringList.add("def");
        stringList.add("ghi");
        stringList.add("jkl");
        stringList.add("mno");
        stringList.add("pqr");

        stringList
                .stream()
                                 .map(upp -> upp.toUpperCase())
                                        .forEach(System.out::println);

        //distinct
        /*
        Arrays
                .stream(arr)
                .distinct()
                .forEach(System.out::println);
       //even
       Arrays
               .stream(arr)
               .filter(evn -> evn%2==0)
               .forEach(System.out::println);

         */
/*
        arrayList
                .stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
                */

        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("aaa",20000);
        map1.put("bbb",50000);//second highest sal
        map1.put("ccc",60000);
        map1.put("ddd",10000);
        map1.put("eee",40000);
        map1.put("fff",50000);
        map1.put("ggg",60000);

//        Map.Entry<String,Integer> result= map1
//                .entrySet()
//                .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .collect(Collectors.toList())
//                .get(0);


        //Get the nth second highest salary
        Map.Entry<Integer, List<String>> result = map1
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(
                                Map.Entry::getKey,
                                Collectors.toList()
                        )))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(1);
            System.out.println("Second highest salary"+result);
        
        }

}