/*Write a Java program that creates two threads: • First thread prints numbers from 1 to 10 at the interval of 1 second. • Second thread prints numbers from 11 to 20 at the interval of 500 ms. Run both threads and display the output.*/

class NumberThread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                Thread.sleep(1000); // 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class NumberThread2 extends Thread {
    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                Thread.sleep(500); // 500 ms
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Practical38 {
    public static void main(String[] args) {
        System.out.println("Ritika Pandey");
        System.out.println("En-roll: 240390107041");

        NumberThread1 t1 = new NumberThread1();
        NumberThread2 t2 = new NumberThread2();

        t1.start();
        t2.start();
    }
}