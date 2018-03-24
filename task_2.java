import java.util.Scanner;

/**
 * рекурсивное вычисление чисел Фибоначи от 1 до N
 */
public class task_2 {

    private static void fibonacci(int previous, int next, int condition) {
        if(next > condition) return;
        System.out.print(next + " ");
        fibonacci(next, previous + next, condition);
    }

    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		System.out.print("Please, enter the integer natural value: ");
        int N = input.nextInt();
		
		System.out.print("Fibonacci numbers: ");
        fibonacci(0, 1, N);
    }
}
