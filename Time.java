/*Create an Employee class with private instance variables for employeeName (String) and employeeSalary (double). Implement public methods readEmployeeData() (to take input from the user) and displayEmployeeData() (to print the employee's name and salary). Demonstrate object creation and method invocation in a main method.*/


class Time {
    int hours;
    int minutes;

    // Method to initialize time
    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    // Method to add two Time objects
    void addTime(Time t1, Time t2) {
        hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;

        // Adjust minutes if greater than or equal to 60
        if (minutes >= 60) {
            hours = hours + (minutes / 60);
            minutes = minutes % 60;
        }
    }

    // Method to display time
    void displayTime() {
        System.out.println(hours + " hours " + minutes + " minutes");
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.setTime(3, 40);
        t2.setTime(2, 35);

        t3.addTime(t1, t2);

        System.out.print("Time 1: ");
        t1.displayTime();

        System.out.print("Time 2: ");
        t2.displayTime();

        System.out.print("Added Time: ");
        t3.displayTime();
    }
}
