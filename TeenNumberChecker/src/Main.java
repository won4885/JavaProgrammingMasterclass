public class Main {

    public static void main(String[] args) {
        boolean checkNum1 = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(checkNum1);

        boolean checkNum2 = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(checkNum2);

        boolean checkNum3 = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(checkNum3);

        boolean checkNum01 = TeenNumberChecker.isTeen(9);
        System.out.println(checkNum01);

        boolean checkNum02 = TeenNumberChecker.isTeen(13);
        System.out.println(checkNum02);
    }
}
