package inheritance_example;

public class NetBanking extends PaymentService{
	void payWithNetBanking(long cusId,long mobile)
	{
	super.sendOTP (mobile) ;
	System. out.println ("Purchased with NetBanking "+ cusId) ;

	}
}
