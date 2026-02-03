/*Design a class Time with hours (int) and minutes (int) as data members. Include method setTime(int h, int m) to initialize the time and displayTime() to display the time. Implement a method addTime(Time t1, Time t2) that takes two Time objects as arguments, adds their hours and minutes, and stores the result in the calling object. Do not use constructors for initialization in this specific practical.*/


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
