package bridgeLab;
import java.util.*;
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] transactions = {2000, -500, 1000, -200, -700};
        int balance = 0;
        for (int t : transactions) {
            if(t>0) {
            	System.out.println("Deposit: " + t);
            	balance+=t;
            }
            else { 
            	System.out.println("Withdraw: " + (-t));
            	 balance -= (-t); 
            }
            
        }
        System.out.println("Final Balance: " + balance);
        if (balance < 0) {
            System.out.println("Overdraft!");
        }

	}

}  

