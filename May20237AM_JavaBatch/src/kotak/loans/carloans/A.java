package kotak.loans.carloans;

import java.util.Date;

public abstract class A 
{
	public int x = 100;
	
	public  void m1()
	{
		x = 200;
		System.out.println("iam m1 from A");
	}
	
	
	abstract void m4();
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
	}

}
