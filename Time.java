public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize time with default values
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor to initialize time with provided values
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Member function to add two Time objects and return the result as a new Time object
    public Time addTime(Time t1, Time t2) {
        Time result = new Time();

        result.seconds = t1.seconds + t2.seconds;
        result.minutes = t1.minutes + t2.minutes + result.seconds / 60;
        result.seconds %= 60;
        result.hours = t1.hours + t2.hours + result.minutes / 60;
        result.minutes %= 60;
        result.hours %= 12; // Considering 12-hour format

        return result;
    }

    // Display function to print the time in 11:59:59 format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Create two Time objects
        Time time1 = new Time(2, 55, 40);
        Time time2 = new Time(5, 20, 30);

        // Create a third Time object by adding the first two
        Time result = new Time().addTime(time1, time2);

        // Display the result
        System.out.print("Output: ");
        result.displayTime();
    }
}
