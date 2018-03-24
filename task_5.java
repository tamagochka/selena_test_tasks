import java.util.Scanner;

/**
 * определение слов палиндромов
 */
public class task_5 {

    public static void main(String[] args) {
		
        System.out.print("Please, enter the word: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
		
		int len = str.length();
		boolean f = true;
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) != str.charAt(len - i - 1)) f = false;
		}
		
		if(f)
			System.out.println("Word '" + str + "' are palindrome.");
		else
			System.out.println("Word '" + str + "' are not palindrome.");
	}
}