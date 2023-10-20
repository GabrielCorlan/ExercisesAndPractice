public class ClockMethod {
    /*You are given a class Clock. It has two int fields: hours and minutes.
    The clock has a minute scale from 0 to 59 and an hour scale from 1 to 12.
    The clock does not know whether it's day or night (no AM or PM).

Implement the method next that increases the value of minutes by 1.
The minutes must be reset to zero when the current hour ends. Do not forget to change the hours as well.

Do not make the fields and methods private.

Let's consider the examples.

1) The initial time of a clock object is 12:00, i.e. hours = 12 and minutes = 0.
Applying method next to the clock changes its field minutes to minutes = 1. In this way, time is 12:01.

Clock clock = new Clock(); // time is 12:00
clock.next(); // time is 12:01
2) The initial time of a clock object is 10:59, i.e. hours = 10 and minutes = 59.
After applying method next to the clock its fields look like hours = 11 and minutes = 0, i.e. time is 11:00 now.

Clock clock = new Clock();
clock.hours = 10;
clock.minutes = 59;
// time is 10:59

clock.next(); // time is 11:00*/

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.next();

        Clock clock1 = new Clock();
        clock1.hours = 10;
        clock1.minutes = 59;
        clock1.next();

        Clock clock2 = new Clock();
        clock2.hours = 16;
        clock2.minutes = 47;
        clock2.next();

    }
}

class Clock {
    int hours = 12;
    int minutes = 0;

    public void next() {
        if (minutes >= 0 && minutes <= 59 && hours >= 1 && hours <= 12) {
            if (minutes == 59) {
                minutes = 0;
                if (hours == 12) {
                    hours = 1;
                } else {
                    hours += 1;
                }
            } else {
                minutes += 1;
            }
        }

        if (minutes >= 0 && minutes < 10) {
            System.out.println("time is " + hours + ":0" + minutes);
        } else {
            System.out.println("time is " + hours + ":" + minutes);
        }
    }

}
