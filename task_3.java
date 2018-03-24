import java.util.Scanner;

public class task_3 {

    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		System.out.print("Please, enter the integer coordinates of the first segment: ");
		long x1 = input.nextLong();
        long y1 = input.nextLong();
        long x2 = input.nextLong();
        long y2 = input.nextLong();
		System.out.print("Please, enter the integer coordinates of the second segment: ");
        long x3 = input.nextLong();
        long y3 = input.nextLong();
        long x4 = input.nextLong();
        long y4 = input.nextLong();
		
        double d = (y4 - y3) * (x1 - x2) - (x4 - x3) * (y1 - y2);
        if (d == 0) { // прямые паралельны или совпадают
            if((x1 * y2 - x2 * y1) * (x4 - x3) - (x3 * y4 - x4 * y3) * (x2 - x1) == 0 &&
				(x1 * y2 - x2 * y1) * (y4 - y3) - (x3 * y4 - x4 * y3) * (y2 - y1) == 0) { // прямые совпадают
					// наложение отрезков друг на друга
					if(x1 > x2) { long temp = x1; x1 = x2; x2 = temp; }
					if(x3 > x4) { long temp = x3; x3 = x4; x4 = temp; }
					if(y1 > y2) { long temp = y1; y1 = y2; y2 = temp; }
					if(y3 > y4) { long temp = y3; y3 = y4; y4 = temp; }
					if(((x1 <= x3 && x3 <= x2) || (x1 <= x4 && x4 <= x2)) && ((y1 <= y3 && y3 <= y2) || (y1 <= y4 && y4 <= y2)))
						System.out.println("Segments are intersect.");
					else
						System.out.println("Segments are not intersect.");
				} else
					System.out.println("Segments are not intersect.");
        } else { // прямые пересекаются
			double a = (x4 - x2) * (y4 - y3) - (x4 - x3) * (y4 - y2);
            double b = (x1 - x2) * (y4 - y2) - (x4 - x2) * (y1 - y2);
            double Ua = a / d;
            double Ub = b / d;
            if(Ua >= 0 && Ua <= 1 && Ub >= 0 && Ub <= 1) // пересечение отрезков
				System.out.println("Segments are intersect.");
			else
				System.out.println("Segments are not intersect.");
		}
	}
}
