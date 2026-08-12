package encapsulation;

public class reportCard {
	private int rollNo;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private int m4;
	private int total;
	private float avg;
	private String grade;
	
	
	public reportCard(int rollNo, String name, int m1, int m2, int m3, int m4) {
		this.rollNo = rollNo;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.calResult();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	public int getTotal() {
		return total;
	}
	public float getAvg() {
		return avg;
	}
	public String getGrade() {
		return grade;
	}
	
	void calResult()
	{
		total=m1+m2+m3+m4;
		avg=total/4.0f;
		
		if(avg>90)
		{
			grade="O";
		}
		else if(avg>75)
		{
			grade="A";
		}
		else if(avg>60) {
			grade="B";
		}
		else if(avg>=50)
		{
			grade="C";
		}
		else
		{
			grade="fail";
		}
	}
	void studentDetails()
	{
		
		System.out.println("rollNo:"+this.rollNo+"\n"+"name:"+this.name+"\n"+"m1:"+this.m1+"\n"+"m2:"+this.m2+"\n"+"m3:"+this.m3+"\n"+"m4:"+this.m4+"\n"+"total:"+this.total+"\n"+"avg:"+this.avg+"\n"+"grade:"+this.grade);
	}
}