import java.util.Scanner;

public class task_4 {

    private static int nod(int previous, int next) {
		if(next == 0) return previous;
		return nod(next, previous % next);
    }

    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the first integer natural value: ");
        int N1 = input.nextInt();
		System.out.print("Please, enter the first integer natural value: ");
		int N2 = input.nextInt();
        
		int nod = nod(N1, N2);
		int nok = (int) (N1 * N2 / nod);
		
		System.out.println("NOD number: " + nod);
		System.out.println("NOK number: " + nok);
        
    }
}
