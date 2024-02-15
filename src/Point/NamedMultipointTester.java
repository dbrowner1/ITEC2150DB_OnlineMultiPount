package Point;

public class NamedMultipointTester {
    public static void main(String[] args) {
        NamedPoint[] namedPoints = SixPointDistanceTester.enterNamedPoint();
        computeShortestDistance(namedPoints);
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