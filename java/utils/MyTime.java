package utils;

public class MyTime {
    public static String getTimeInHoursMinutesSeconds(int timeSeconds) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        String nameOfHours = null;
        String nameOfMinutes = null;
        String nameOfSeconds = null;

        hours = timeSeconds / 3600;
        minutes = (timeSeconds - hours * 3600) / 60;
        seconds = timeSeconds - hours * 3600 - minutes * 60;
        a = hours - ((Math.round(hours / 10)) * 10);
        b = minutes - ((Math.round(minutes / 10)) * 10);
        c = seconds - ((Math.round(seconds / 10)) * 10);
        if (a == 0 || (a > 4 & a < 10)) {
            nameOfHours = "часов";
        }
        if (a == 1) {
            nameOfHours = "час";
        }
        if (a > 1 & a < 5) {
            nameOfHours = "часа";
        }

        if (b == 0 || (b > 4 & b < 10)) {
            nameOfMinutes = "минут";
        }
        if (b == 1) {
            nameOfMinutes = "минута";
        }
        if (b > 1 & b < 5) {
            nameOfMinutes = "минуты";
        }

        if (c == 0 || (c > 4 & c < 10)) {
            nameOfSeconds = "секунд";
        }
        if (c == 1) {
            nameOfSeconds = "секунда";
        }
        if (c > 1 & c < 5) {
            nameOfSeconds = "секунды";
        }

        if ((hours == 0) & (minutes != 0)) {
            return minutes + " " + nameOfMinutes + " " + seconds + " " + nameOfSeconds;
        }
        if ((hours == 0) & (minutes == 0)) {
            return seconds + " " + nameOfSeconds;
        } else {

            return hours + " " + nameOfHours + " " + minutes + " " + nameOfMinutes + " " + seconds + " " + nameOfSeconds;
        }


    }
}
