import java.util.Scanner;

public class Num4_TSP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxWeight=scanner.nextInt();
		int n = scanner.nextInt();
		int[] price=new int[n];
		int[] weight=new int[n];
		for(int i=0;i<n;i++){
			price[i]=scanner.nextInt();
			weight[i]=scanner.nextInt();
		}
		System.out.println(tsp_turing(maxWeight, price, weight, 0));
	}

	public static int tsp_turing(int maxWeight, int[] price, int[] weight,
			int i) {
		if(maxWeight<=0)return 0;
		if(i==price.length-1)
			if(weight[i]<=maxWeight)
				return price[i];
			else
				return 0;
		if(weight[i]<=maxWeight)
		return max(tsp_turing(maxWeight, price, weight, i + 1),
				tsp_turing(maxWeight - weight[i], price, weight, i+1)+price[i]);
		else
			return 0;
	}

	public static int max(int a, int b) {
		if (a > b)
			return a;
		return b;
	}
}
