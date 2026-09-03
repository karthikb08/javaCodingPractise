package org.example;

import java.util.Scanner;

public class QueueExample {
    private  static int front = -1;
    private static int rear = -1;
    public static void main(String[] args) throws IllegalAccessException {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = ip.nextInt();
        int[] arr = new int[n];

        while(true){
            System.out.print("Enter operation (add/remove/list/exit): ");
           String op = ip.next();
           String sw =  switch(op){ 
                case "add" -> {
                    enQueue(arr,ip);
                        yield "Added";
                }
                case "remove" ->{
                    deQueue(arr,ip);
                    yield "remove";
                }
                case "list" ->{
                    listQueue(arr);
                    yield "list";
                }
                 case "exit" -> "Exiting...";

               default -> throw new IllegalStateException("Unexpected value: " + op);
           };
            if(op.equals("exit")){
                break;
            }
        }
        ip.close();
    }

    private static void listQueue(int[] arr) {
        if(front==-1 && rear ==-1){
            System.out.println("Queue Empty");
        }
        for(int i=front; i<=rear;i++){
            System.out.println(arr[i]);
        }
    }

    private static void deQueue(int[] arr, java.util.Scanner ip) {
        if(rear==-1 && front ==-1){
            System.out.println("Queue is empty!");
        }else if(rear == front){
            System.out.println("Dequeue " + arr[front]);
            front =-1;
            rear =-1;
        }else {
            System.out.println("Dequeue " +arr[front]);
            front++;
        }
    }

    private static void enQueue(int[] arr, java.util.Scanner ip) {
        if(rear == arr.length-1){
            System.out.println("Queue is full!");
        }
        else if(rear ==-1 && front ==-1){
            front =0;
            rear =0;
            int value = ip.nextInt();
            arr[rear] =value;
            System.out.println("Enqueue "+ value);
        }else {
            int value = ip.nextInt();
            rear++;
            arr[rear] = value;
            System.out.println("Enqueue "+ value);
        }
    }
}
