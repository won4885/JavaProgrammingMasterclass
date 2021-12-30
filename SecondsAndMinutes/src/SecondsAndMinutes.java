public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;

    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60; // 똑같은 seconds 변수에 저장하지 말고 이렇게 다른 이름의 변수로 저장하자

        return getDurationString(minutes, remainingSeconds);
    }




    /*
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
    */

    }
