public class Main {

    public static void main(String[] args) {
        boolean wakeUp1 = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(wakeUp1);

        boolean wakeUp2 = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(wakeUp2);

        boolean wakeUp3 = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(wakeUp3);

        boolean wakeUp4 = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(wakeUp4);
    }
}
