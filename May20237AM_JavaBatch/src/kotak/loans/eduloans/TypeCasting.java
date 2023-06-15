package kotak.loans.eduloans;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		// byte-1, short-2, int-4, long-8, float-4, double-8
		
		// 1-liter ---> 500ml  ---> There is no risk  --->  Widening
		// 1-liter ---> 1.5ltr ---> There is a risk(water overflow) ---> Narrowing
		
		// Type Casting from one primitive type to another primitive type
		
		int x1 = 10;
		System.out.println(x1);
		
		//double x2 = x1;
		double x2 = (double)x1;
		System.out.println(x2);
		
		double y1 = 12.43;
		System.out.println(y1);
		
		int y2 = (int)y1;
		System.out.println(y2);
		
		char c1 = 'a';
		System.out.println(c1);
		
		int c2 = (int)c1;
		System.out.println(c2);
		
		// Type Casting from one primitive type to corresponding wapper class type
		
		int p1 = 100;
		System.out.println(p1);
		
		//Integer p2 = p1;
		Integer p2 = Integer.valueOf(p1);
		System.out.println(p2);
		
		Integer k1 = 10;
		System.out.println(k1);
		
		int k2 = (int)k1;
		System.out.println(k2);
		
		// Type Casting from one wapper class type to another wapper class type
		
		String s1 = "300";
		String s2 = "200";
		
		System.out.println(s1+s2);
		
		float i = Float.parseFloat(s1);
		float j = Float.parseFloat(s2);
		System.out.println(i+j);
		
		int p = Integer.parseInt(s1);
		int q = Integer.parseInt(s2);
		System.out.println(p+q);

	}

}
