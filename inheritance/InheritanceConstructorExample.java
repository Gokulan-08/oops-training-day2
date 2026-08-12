package inheritance;

//class Y{
	
//	Y()
//	{
//		System.out.println("Y constructor");
//	}
//}

//class Z extends Y{
	
//	Z()
//	{
//		System.out.println("Z constructor");
//	}
//}

class Y{
	
	Y(int num)
	{
		System.out.println("Y constructor"+num);
	}
}

class Z extends Y{
	
	Z(int num)
	{
		super(num);
		System.out.println("Z constructor");
	}
}
public class InheritanceConstructorExample {

	public static void main(String[] args) {
		Z obj1=new Z(100);

	}

}
