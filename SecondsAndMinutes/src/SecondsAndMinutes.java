public class SecondsAndMinutes {

    public static void main(String[] args) {
        getDurationString(61, 0);

        getDurationString(2400);

    }

    public static String getDurationString(int minutes, int seconds) {
        int hours;
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            hours = minutes / 60;
            int min = minutes % 60;
            System.out.println(hours + "h " + min + "m " + seconds + "s");
        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds) {
        int minutes;
        if (seconds >= 0) {
            minutes = seconds / 60;
            seconds = seconds % 60;
            getDurationString(minutes, seconds);
        }
        return "Invalid value";
    }

    }
