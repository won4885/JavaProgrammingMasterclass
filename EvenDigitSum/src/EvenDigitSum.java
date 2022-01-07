public class EvenDigitSum {


    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = 0;
        int sumOfEvenDigits = 0;

        while (number > 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sumOfEvenDigits += lastDigit;
            }
            number /= 10;
        }

        return sumOfEvenDigits;
    }
}
