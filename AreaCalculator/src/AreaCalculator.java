public class AreaCalculator {
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        double areaOne = area(5.0, 4.0);
        System.out.println(areaOne);

        double areaTwo = area(5.0);
        System.out.println(areaTwo);

        double areaThree = area(-1);
        System.out.println(areaThree);

        double areaFour = area(-1.0, 4.0);
        System.out.println(areaFour);

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }
}
