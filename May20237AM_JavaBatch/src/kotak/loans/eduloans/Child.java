package kotak.loans.eduloans;


class Parent
{
	public  Character workhard()
	{
		System.out.println("Parent : wakeup early, goto college");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent : atmost care....");
	}
}

public class Child extends Parent
{
	public Character workhard()
	{
		System.out.println("Child : wakeup anytime, goto movie");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.workhard();
		obj.care();
		obj.love();
	}
}
