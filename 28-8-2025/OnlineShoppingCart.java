package bridgeLab;
import java.util.*;

public class OnlineShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] products = {"Mobile", "Laptop", "Headphone", "Keyboard", "Mouse", "Charger"};
		int[] prices = {3000, 40000, 1500, 800, 400, 200};
		while (true) {
		    int total = 0;

		    int n;
		    do {
		        System.out.println("How many items you want to buy?");
		        n = sc.nextInt();
		    } while (n < 1);

		    for (int i = 0; i < n; i++) {
		    	
		        for (int j = 0; j < products.length; j++) {
		            System.out.println((j+1) + ". " + products[j] + " - " + prices[j]);
		        }

		        int choice = sc.nextInt();
		        switch(choice) {
		            case 1: total += prices[0]; break;
		            case 2: total += prices[1]; break;
		            case 3: total += prices[2]; break;
		            case 4: total += prices[3]; break;
		            case 5: total += prices[4]; break;
		            case 6: total += prices[5]; break;
		            default: System.out.println("Invalid choice!");
		        }
		    }

		    
		    if (total > 5000) {
		        int discount = (int)(total * 0.10);
		        total -= discount;
		        System.out.println("Discount Applied: " + discount);
		    } else {
		        System.out.println("No discount applied.");
		    }

		    System.out.println("Final Amount: " + total);  
		    

		}


	}

}
