import java.util.Scanner;


public class Num3_jamshid_economicDevelopement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(possibleAns(n));
	}
	
	public static int possibleAns(int n){
		return possibleAns(n-7, 7)+possibleAns(n-5, 5)+possibleAns(n-3, 3);
	}
	public static int possibleAns(int n,int take){
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		if(take==7){
			return possibleAns(n-7, 7)+possibleAns(n-5, 5)+possibleAns(n-3, 3);
		}
		else if(take==5){
			return possibleAns(n-5, 5)+possibleAns(n-3, 3);
		}
		else if(take==3){
			return possibleAns(n-3, 3);
		}
		return 0;
	}
	
}
