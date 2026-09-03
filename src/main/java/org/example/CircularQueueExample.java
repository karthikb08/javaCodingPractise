import java.util.Scanner;


public class CircularQueueExample {
    private static int front=-1;
    private static int rear =-1;
    public static void main(String[] args) throws IllegalAccessException {



     Scanner ip = new Scanner(System.in);

     System.out.println("Enter the n valus: ");

     int n = ip.nextInt();

     int[] arr = new int[n];

     while(true){
         System.out.println("Enter the operations add/remove/list/exit: ");
         String ops = ip.next();
         String op = switch (ops){

             case "add" -> {
                 enQueue(arr, ip);
                 yield "Added !";
             }
             case "remove" -> {
                 deQueue(arr);
                 yield " Removed !";
             }
             case "list" ->{

                 listAll(arr);
                 yield "Listed !";
             }
             case "exit" ->{
                 yield "Exiting...";
             }
             default -> throw new IllegalAccessException("Invalid");
         };

         if(op.equals("exit")){
             break;
         }

     }
        ip.close();

    }

    private static void listAll(int[] arr) {

        if(front==-1 && rear==-1){
            System.out.println("No Data !");
        }
//        for(int i=front;i<=rear;i++){
//
//            System.out.println("Queue values are "+ arr[i]);
//        }
        int i = front;
        while(i!= rear){
            System.out.println(arr[i]);
            i = ((i +1) % arr.length);
        }
        System.out.println(arr[rear]);
    }

    //10,20,30,40,50
    private static void deQueue(int[] arr) {
        //d = d + 1 % arr.length-1
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty ! ");
        }else if(rear == front){
                System.out.println("Dequeue value: "+ arr[front]);
                front=-1;
                rear =-1;
        }else{
            front = (front+1) % arr.length;
            System.out.println("Dequeue value: "+ arr[front]);
        }

    }

    private static void enQueue(int[] arr, Scanner s){
        //r= r+1 % arr.length-1
        if(front == ((rear+1) % arr.length)){
            System.out.println("Queue is full !");
        }else if(front ==-1 && rear ==-1){
            int value = s.nextInt();
            front = 0;
            rear = 0;
            arr[rear] = value;
            System.out.println("Enqueue value: " + value);
        }else{
            int value = s.nextInt();
            rear = ((rear+1) % arr.length);
            arr[rear] = value;
            System.out.println("Enqueue value: " + value);
        }

    }
}
