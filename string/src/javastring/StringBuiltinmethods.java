package javastring;

public class StringBuiltinmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ahamed";
		String s1 = "ismail";
		

s = s + s1;

		System.out.println(s);

		s1 = s.substring(0, s.length() - s1.length());
	

		System.out.println(s1);

		s = s.substring(s1.length());

		System.out.println(s);

		if (s.equals(s1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		s = s.toUpperCase();
		System.out.println(s);

		s1 = s1.toUpperCase();
		System.out.println(s1);

		if(s==s1)
			
		
		{
		
		System.out.println(true);
		}
		
		else
		{
			System.out.println(false);
		}
	}

}
