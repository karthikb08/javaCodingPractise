import java.util.concurrent.Semaphore;

public class ThreadExample {

    private final int limit = 10;

    // Fixed: semOdd starts at 1, semEven starts at 0
    private final Semaphore semOdd = new Semaphore(1);
    private final Semaphore semEven = new Semaphore(0);

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();

        new Thread(threadExample::printOdd, "Thread1").start();
        new Thread(threadExample::printEven, "Thread2").start();
    }

    private void printOdd() {
        // Start from 1, go to 10
        for (int i = 1; i <= limit; i += 2) {
            try {
                semOdd.acquire(); // Fixed: Odd thread must acquire semOdd
                System.out.println(Thread.currentThread().getName() + ":" + i);
                semEven.release(); // Fixed: Pass turn to Even thread
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void printEven() {
        // Start from 2, go to 10
        for (int i = 2; i <= limit; i += 2) {
            try {
                semEven.acquire(); // Wait for Even's turn
                System.out.println(Thread.currentThread().getName() + ":" + i);
                semOdd.release(); // Fixed: Pass turn back to Odd thread
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}