/*Write a Java program where Thread T1 prints 1 to 100, T2 prints 101 to 200 and T3 prints 201 to 300. Initiate execution of all the three threads but ensure that numbers should be printed sequentially.*/

class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
        }
    }
}
class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.print(i);
        }
    }
}

class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.print(i);
        }
    }
}

public class Practical39 {
    public static void main(String[] args) {
        System.out.println("Ritika Pandey");
        System.out.println("En-roll: 240390107041");
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        try {
            t1.start();
            t1.join(); // Wait until T1 finishes

            t2.start();
            t2.join(); // Wait until T2 finishes

            t3.start();
            t3.join(); // Wait until T3 finishes

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}