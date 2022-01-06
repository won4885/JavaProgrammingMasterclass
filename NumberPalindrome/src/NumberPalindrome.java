public class NumberPalindrome {


    public static boolean isPalindrome(int number) {
        int lastDigit = 0;
        int num = number; // 이렇게 따로 변수를 선언해야 된다 !!

        while (num != 0) {
            lastDigit = num % 10 + lastDigit * 10 ; // lastDigit * 10: 자릿수 곱해나가기, number % 10: 거꾸로
            num /= 10;

        }
        if (lastDigit == number) {
            return true;
        } else {
            return false;
        }



    }
}
