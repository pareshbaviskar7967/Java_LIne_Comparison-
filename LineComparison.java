import java.util.*;

class LineComparison {
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        double dist1;
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
    }
}
