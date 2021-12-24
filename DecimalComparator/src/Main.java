public class Main {

    public static void main(String[] args) {
        boolean areEqual1 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(areEqual1);

        boolean areEqual2 = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(areEqual2);

        boolean areEqual3 = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(areEqual3);

        boolean areEqual4 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(areEqual4);
    }
}
