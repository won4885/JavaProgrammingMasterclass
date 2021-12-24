package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theReaminder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }



        /*
        double firstDoubleValue = 20.00;
        double secondDoubleValue = 80.00;
        double addFirstSecond = firstDoubleValue + secondDoubleValue;
        System.out.println("Add First and Second = " + addFirstSecond);
        double myRemainder = secondDoubleValue % firstDoubleValue;
        System.out.println("Remainder of First and Second = " + myRemainder);
        boolean isRemainderZero = (myRemainder == 0) ? true : false;
        System.out.println("Remainder is zero?: " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
        */
    }
}
