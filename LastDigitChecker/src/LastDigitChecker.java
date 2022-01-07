public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber < 10 || firstNumber > 1000) || (secondNumber < 10 || secondNumber > 1000) || (thirdNumber < 10 || thirdNumber > 1000)) {
            return false;
        }

        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberLastDigit = secondNumber % 10;
        int thirdNumberLastDigit = thirdNumber % 10;

        return ((firstNumberLastDigit == secondNumberLastDigit) ||
                (firstNumberLastDigit == thirdNumberLastDigit) ||
                (secondNumberLastDigit == thirdNumberLastDigit));

    }

    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        } else {
            return false;
        }


    }
}
