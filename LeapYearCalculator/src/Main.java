public class Main {

    public static void main(String[] args) {
        boolean leapYear1 = LeapYearCalculator.isLeapYear(-1600);
        System.out.println(leapYear1);
        boolean leapYear2 = LeapYearCalculator.isLeapYear(1600);
        System.out.println(leapYear2);
        boolean leapYear3 = LeapYearCalculator.isLeapYear(2017);
        System.out.println(leapYear3);
        boolean leapYear4 = LeapYearCalculator.isLeapYear(1924);
        System.out.println(leapYear4);
    }
}
