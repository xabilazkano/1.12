import java.util.Scanner;
public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Tell me a number: ");
			a = sc.nextInt();
			do {
			System.out.print("* ");
			b++;
		} while (b<a);
			b=0;
			System.out.println();
	} while (a!=0);
	
		System.out.println("The programm has finished");

}
}