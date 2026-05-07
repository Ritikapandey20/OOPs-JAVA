/*Write a Java program where two threads print multiplication tables (e.g., Table of 5 and Table of 7). Use a synchronized method so that table outputs do not mix and remain consistent.*/

class TablePrinter {

    // Synchronized method
    synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class MyThread1 extends Thread {
    TablePrinter obj;

    MyThread1(TablePrinter obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printTable(5);
    }
}

class MyThread2 extends Thread {
    TablePrinter obj;

    MyThread2(TablePrinter obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printTable(7);
    }
}

public class Practical40 {
    public static void main(String[] args) {
        System.out.println("Ritika Pandey");
        System.out.println("En-roll: 240390107041");
        TablePrinter obj = new TablePrinter();

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}