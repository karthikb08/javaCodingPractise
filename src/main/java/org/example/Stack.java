package org.example;

import java.util.Scanner;

public class Stack {
    static int top = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        while (true) {
            System.out.print("Enter operation (add/remove/list/exit): ");
            String operations = sc.next();
            String result = switch (operations) {
                case "add" -> {
                    add(arr, sc);
                    yield "Added";
                }
                case "remove" -> {
                    remove(arr);
                    yield "Removed";
                }
                case  "list" -> {
                    listArr( arr,top);
                    yield  "Listed";
                }
                case "exit" -> "Exiting...";
                default -> throw new IllegalArgumentException("Invalid operation: " + operations);
            };

            System.out.println(result);

            if (operations.equals("exit")) {
                break;
            }
        }

        sc.close();
    }

    private static void remove(int[] arr) {
        if (top < 0) {
            System.out.println("Stack is Empty!");
        } else {
            int poppedElement = arr[top];
            top--;
            System.out.println("Popped value: " + poppedElement);
        }
    }

    private static void add(int[] arr, Scanner sc) {
        if (top >= arr.length - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        System.out.print("Enter value to push: ");
        int value = sc.nextInt();
        top++;
        arr[top] = value;
        System.out.println("Pushed: " + value);
    }

    private static void listArr(int[] arr, int top){

        if (top < 0) {
            System.out.println("Stack is Empty!");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println("Stack " + arr[i]);
        }
    }
}