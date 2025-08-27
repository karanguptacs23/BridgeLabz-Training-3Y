package bridgeLab;
import java.util.*;
public class Cricket {
	
	static void score(int[] arr) {
		int max=arr[0] , min=arr[0]; 
		double total=0;
		for(int x:arr) {
			if(x>max) {
				max=x;
			}
			if(x<min) {
				min=x;
			}
			total+=x;
		}
		
		System.out.println("Average amount: "+(total/arr.length));
		System.out.println("Maximum amount: "+max);
		System.out.println("Minimum amount: "+min);
		if(total>=100) System.out.println("Century");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("how many elements you want to enter");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		
		}
		score(arr);

	}

}
