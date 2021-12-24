public class Main {
    public static void main(String[] args) {
        boolean checkEqual1 = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println(checkEqual1);

        boolean checkEqual2 = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println(checkEqual2);

        boolean checkEqual3 = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(checkEqual3);
    }
}
