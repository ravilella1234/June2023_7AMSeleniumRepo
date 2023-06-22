package kotak.loans.eduloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		String s3 = "ravikan";
		System.out.println(s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.contains(s3));
		
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		String s4 = "Ravikanth";
		System.out.println(s4);
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		
		System.out.println(s4.replace('R', 'K'));
		System.out.println(s4.substring(2, 7));
		
		String s5 = " ravikanth";
		System.out.println(s5);
		System.out.println(s1.equals(s5));
		System.out.println(s5.trim());
		System.out.println(s1.equals(s5.trim()));
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5.trim()));
		System.out.println(s4.toLowerCase().equals(s5.trim()));
		
		String s6 = "ravi kanth lella";
		System.out.println(s6);
		String[] str = s6.split(" ");
		System.out.println(str.length);
		for(String s:str)
		{
			System.out.println(s);
		}
		
		System.out.println(s1);
		System.out.println(s4.toLowerCase().startsWith("ravi"));
	}
}
