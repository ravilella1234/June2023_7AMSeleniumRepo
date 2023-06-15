package kotak.loans.eduloans;

public class VariableType 
{
	//primitive variable
	int x = 100; // instance variable
	static String cname = "vmware"; // static variable
	static VariableType obj = new VariableType();
	
	public void m1()
	{
		int x = 200; // local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableType.cname);
	}
	
	public static void m2()
	{
		//VariableType obj = new VariableType();
		System.out.println(obj.x);
		System.out.println(VariableType.cname);
	}
	
	public static void main(String[] args) 
	{
		//VariableType obj = new VariableType(); // non-primitive (or) reference variable
		System.out.println(obj.x);
		System.out.println(VariableType.cname);		
	}

}
