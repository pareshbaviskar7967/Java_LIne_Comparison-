import java.util.*;

import javax.sound.sampled.Line;

class LineComparison {

    public double LineComp() {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2;

        System.out.println("Enter value for x1: ");
        x1 = sc.nextDouble();

        System.out.println("Enter value for y1: ");
        y1 = sc.nextDouble();

        System.out.println("Enter value for x2: ");
        x2 = sc.nextDouble();

        System.out.println("Enter value for y2: ");
        y2 = sc.nextDouble();

        return (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }

    public static void main(String[] args) {

        LineComparison compare1 = new LineComparison();

        System.out.println("Enter the Co-Ordinates 4 1st line : ");
        double first = compare1.LineComp();
        System.out.println("Length is " + first);

        System.out.println("Enter the Co-Ordinates 4 2nd line : ");
        double second = compare1.LineComp();
        System.out.println("Length is " + second);

        String frstobj = String.valueOf(first);
        String scndobj = String.valueOf(second);

        int length_compare = frstobj.compareTo(scndobj);

        if (length_compare > 0)
            System.out.println("Length of line L1 is greater than line L2  ");
        else if (length_compare < 0)
            System.out.println("Length of line L1 is smaller than line L2  ");
        else
            System.out.println("Length of line L1 is equal to line L2  ");
    }
}
