import java.util.Scanner;

public class Hungry {

	public static void main(String args[]) {
		
		System.out.println("Hey there Im hungry");
	
	Scanner sc= new Scanner(System.in);
	System.out.println("are you hungry yes/no");
	if(sc.nextLine().equalsIgnoreCase("yes")) {
		System.out.println("Im hungry");
		System.out.println("I ate pizza");
		System.out.println("we ate fried");
	}
	else {
		System.out.println("Do your homework");
	}
	}
}
