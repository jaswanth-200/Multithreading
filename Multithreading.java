import java.util.Scanner;
class Square extends Thread {
    int begin;
    int end;

    // Constructor to initialize the range
    Square(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    synchronized public void run() {
            for (int i = begin; i <= end; i++) {
                System.out.println("Square of  " + i + ": " + i * i);
            }
        }
    }

public class Multithreading {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter beginning of the range:");
        int begin = sc.nextInt();
        System.out.println("Enter end of the range:");
        int end = sc.nextInt();
        
        //  two threads 
        Square thread1 = new Square(begin, end);
        Square thread2 = new Square(begin, end);
    
        // Start both threads
        thread1.start();
        thread2.start();
    }
}
