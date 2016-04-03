import java.util.Scanner;


public class Num1_fractional_currency_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(coin(n))System.out.println("YES");
		else System.out.println("NO");
	}
	public static boolean coin(int n){
		if(n<=0)
			return false;
		if(n==3||n==5||n==7)
			return true;
		if(coin(n-3) || coin(n-7) || coin(n-5))
			return true;
		else
			return false;
	}
}
