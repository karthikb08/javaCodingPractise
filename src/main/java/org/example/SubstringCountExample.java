package org.example;

public class SubstringCountExample {
    public static void main(String[] args) {
        String mainStr = "helloslkhellodjladfjhello";
        String findStr = "hello";
        int lastIndex = 0;
        int count = 0;

        while(lastIndex !=-1) {
            lastIndex =  mainStr.indexOf(findStr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length() + 1;

            }
        }
        System.out.println("The substring \"" + findStr + "\" appears " + count + " times.");

    }
}
