public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        // Math 메소드 쓰는 게 아니라 Casting 써야 함
        int a = (int) (one * 1000); // 어차피 단순 비교 문제니 int 캐스팅을 해도 아무 문제 없다
        int b = (int) (two * 1000); // 단, 소수 3번째 자리까지라는 것을 감안하여 1000을 곱해준다

        if (a == b) {
            return true;
        }
        return false;
    }
}
