package inheritance_example;
import java.util.*;
public class HeirarchicalInheritance {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("1.CreditCardService");
		System.out.println("2.NetBanking");
		System.out.println("enter the choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			CreditCardService card=new CreditCardService();
		    card.payWithCreditCard( 1187263718, 76317637);
		    break;
		case 2:
			NetBanking net=new NetBanking();
		    net.payWithNetBanking(2405020,324545336);
		    break;
		default:
			System.out.println("Invalid Choice!");
		}
		sc.close();
	}
}
