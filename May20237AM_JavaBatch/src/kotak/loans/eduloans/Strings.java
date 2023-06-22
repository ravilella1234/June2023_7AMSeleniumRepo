package kotak.loans.eduloans;

public class Strings 
{

	public static void main(String[] args) 
	{
		String s1 = "ravi";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		//String s2 = new String("kanth");
		//System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("lella");
		System.out.println(s3);
		System.out.println(s3.hashCode());
		//s3 = new StringBuffer("kiran");
		s3.append("ravi");
		System.out.println(s3);
		System.out.println(s3.hashCode());

	}

}
