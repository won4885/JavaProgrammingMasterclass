public class Main {

    public static void main(String[] args) {
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);


//        while (true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for (int i = 1; i < 7; i++) {
//            System.out.println("Count value is" + i);
//        }
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }

        // Challenge
//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) { // 짝수가 아니라면 반복문 처음으로 되돌아감
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }

        // Challenge two
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) { // 짝수가 아니라면 반복문 처음으로 되돌아감
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
