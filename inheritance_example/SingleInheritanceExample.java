package inheritance_example;

public class SingleInheritanceExample {

	public static void main(String[] args) {
		BankServiceV2 service = new BankServiceV2();
		service.deposit (1028993, 1000) ;
		service.wihdraw(1028993, 500) ;
		service.updateAadharNumber () ;
	}
}
