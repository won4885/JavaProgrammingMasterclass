// 이 문제는 다시 한 번 볼 필요가 있다. 수학의 등식과 헷갈리는 부분들이 많다.
// feet, inches, cm의 관계를 다시 생각해 보자. 평소의 생각을 뒤집어야 될 때다.

public class Main {

    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(7, 5);
        System.out.println(result);

//        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
//        if (centimeters < 0.0) {
//            System.out.println("Invalid parameters");
//        }

        calcFeetAndInchesToCentimeters(156);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters;
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            // 1 inch = 2.54 cm, 1 feet = 12 inches
            centimeters = (feet * 12) * 2.54; // 매개변수 feet -> centimeters
            centimeters += inches * 2.54; // 매게변수 inches -> centimeters 각각 따로 해주고 저장해야지!
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        } else {
            System.out.println("Invalid feet of inches parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


    }
