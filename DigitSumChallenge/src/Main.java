public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
//        while (number > 0) {
//            sum += number % 10;
//            number /= 10;
//        }

        // 125 -> (125 / 10) = 12 -> (12 * 10) = 120 -> (125 - 120) = 5
        while (number > 0) { // 숫자를 10으로 나눠야 하기 때문에 0이 되는 순간이 반드시 온다
            // extract
            int digit = number % 10;
            sum += digit;

            //drop
            number /= 10;
        }
        return sum;
    }
}
