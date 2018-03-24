import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
		
        System.out.print("Please, enter the integer natural value: ");
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        boolean A[] = new boolean[N + 1];

        for(int i = 2; i * i <= N; i++) {
            if(!A[i])
                for (int j = i * i; j <= N; j += i)
                    A[j] = true;
        }
		
		System.out.print("Primes: ");
        for(int i = 2; i <= N; i++)
            if(!A[i]) System.out.print(i + " ");
    }
}