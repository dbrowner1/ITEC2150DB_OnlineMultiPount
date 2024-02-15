package Point;

import java.util.Scanner;

public class SixPointDistanceTester {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        computeShortestDistance(enterNamedPoint());
    }

    public static NamedPoint[] enterNamedPoint() {
        NamedPoint[] namedPoints = new NamedPoint[6];
        System.out.println("Enter 6 named points (name, x, y): ");
        for (int i = 0; i < namedPoints.length; i++) {
            String name = input.next();
            double x = input.nextDouble();
            double y = input.nextDouble();
            namedPoints[i] = new NamedPoint(name, x, y);
        }
        return namedPoints;
    }

    public static void computeShortestDistance(NamedPoint[] namedPoints) {
        double shortestDistance = Point.distance(namedPoints[0], namedPoints[1]);
        NamedPoint p1 = namedPoints[0];
        NamedPoint p2 = namedPoints[1];

        for (int i = 0; i < namedPoints.length - 1; i++) {
            for (int j = i + 1; j < namedPoints.length; j++) {
                double aDistance = Point.distance(namedPoints[i], namedPoints[j]);

                if (aDistance < shortestDistance) {
                    shortestDistance = aDistance;
                    p1 = namedPoints[i];
                    p2 = namedPoints[j];
                }
            }
        }

        System.out.printf("The shortest distance between %s and %s is %.2f%n", p1, p2, shortestDistance);
    }
}