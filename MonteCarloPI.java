package examples;
import java.util.Scanner;
public class MonteCarloPI {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many dot will entered?");
        int numberOfDots = scn.nextInt();
        int numberInCircle = 0;
        double start = System.currentTimeMillis();
        for (int i = 0; i<numberOfDots; i++){
            double x_angle = Math.random();
            double y_angle = Math.random();
            double distance = (x_angle*x_angle + y_angle*y_angle);

            if (distance <= 1) {
                numberInCircle++;
            }
        }
        double end = System.currentTimeMillis();
        double estimatedTime = end-start;
        double myPI = 4.0*numberInCircle/numberOfDots;
        System.out.println("Estimated myPI is: " + myPI);
        System.out.println("Java's pi: " + Math.PI);
        System.out.println("Time: " + estimatedTime + "ms.");
    }
}
