import java.util.Scanner;

/**
 * удаление цифр из текста
 */
public class task_6 {

    public static void main(String[] args) {
		
        System.out.print("Please, enter the word: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
		String dig = "0123456789";
		StringBuilder buf = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			if(dig.indexOf(str.charAt(i)) == -1)
				buf.append(str.charAt(i));
		}
		
		System.out.print("Word without digits: " + buf);
		
		
	}
}