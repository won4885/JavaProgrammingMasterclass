public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";

    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
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
