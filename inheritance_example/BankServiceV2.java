package inheritance_example;

public class BankServiceV2 extends BankServiceV1{
	void updateAccountDetails () 
	{
	System. out.println("Account details updated ... ") ;
	}
	void updateAadharNumber () 
	{
	System. out. println ("Aadhaar No updated ... ") ;
	}
	void applyForPersonalLoan (long accNo, float loanAmount, int tenure) 
	{
	System. out.println("Your loan application is processing ... ") ;
	}
}