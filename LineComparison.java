import java.util.*;

class LineComparison {
    public static void main(String[] args) {
        double x1, x2, x3, x4, y1, y2, y3, y4;
        double dist1, dist2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for x1: ");
        x1 = sc.nextDouble();

        System.out.println("Enter value for y1: ");
        y1 = sc.nextDouble();

        System.out.println("Enter value for x2: ");
        x2 = sc.nextDouble();

        System.out.println("Enter value for y2: ");
        y2 = sc.nextDouble();

        dist1 = (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("Length is " + dist1);

        System.out.println("Enter value for x3: ");
        x3 = sc.nextDouble();

        System.out.println("Enter value for y3: ");
        y3 = sc.nextDouble();

        System.out.println("Enter value for x4: ");
        x4 = sc.nextDouble();

        System.out.println("Enter value for y4: ");
        y4 = sc.nextDouble();

        dist2 = (Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3)));
        System.out.println("Length is " + dist2);

        if (dist1 == dist2)
            System.out.println("The Line is equals");
        else
            System.out.println("The Line is not equals");
    }
}
