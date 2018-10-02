import java.util.Scanner;
public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		
		
		
		do {
		
				System.out.println("Tell me the first number:");
				a = sc.nextInt();
				System.out.println("Tell me the second number:");
				b = sc.nextInt();
				
				System.out.println("The numbers are "+a+" and "+b);
		
		} 	while (!(a==123 && b==321)&&!(a==321 && b==123));
			
		System.out.println("The program has finished");
		
	
}
}