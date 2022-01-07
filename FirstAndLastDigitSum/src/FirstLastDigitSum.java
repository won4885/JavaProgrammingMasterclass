public class FirstLastDigitSum {


    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstNumber = number;
        int lastNumber = number % 10;
        while (firstNumber >= 10) {
            firstNumber /= 10;
        }
        return firstNumber + lastNumber;
    }
}
