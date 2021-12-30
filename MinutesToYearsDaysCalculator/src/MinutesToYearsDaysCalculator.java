public class MinutesToYearsDaysCalculator {
    private static final String INVALID_VALUE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }
        long hours = minutes / 60;
        long remainingHours = minutes % 60;
        long days = hours / 24;
        long remainingDays = hours % 24;
        long years = days / 365;
        long remainingYears = days % 365;

        System.out.println(minutes + " min = "
                + years + " y and " + remainingYears + " d");
    }
}
