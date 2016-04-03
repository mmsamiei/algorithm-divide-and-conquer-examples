import java.util.Scanner;


public class Num2_kashi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(possibleStates(n));
	}
	
	public static int possibleStates(int n){
		if(n<3)
			return 0;
		if(n==3 || n==5 || n==7)
			return 1;
		return possibleStates(n-3)+possibleStates(n-5)+possibleStates(n-7);
	}
}
