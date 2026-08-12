package inheritance_example;

public class BankServiceV1 {
	void deposit (long accNo, float amount)
	{
	System. out.println ("Amount "+amount+" deposited to "+accNo);
	}
	void wihdraw(long accNo, float amount) 
	{
	System. out.println("Amount "+amount+" withdrawn from "+accNo);
	}
	void printRecipt () 
	{
	System. out.println("Account No");
	System. out.println("Account Holder Name");
	System. out.println ("Balance");
    }
}
