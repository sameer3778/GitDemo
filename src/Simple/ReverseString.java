package Simple;

public class ReverseString {

	public static void main(String[] args)
	{
		String currentDirectory = System.getProperty("user.dir");
	      System.out.println("The current working directory is " + currentDirectory);

		ReverseString ob = new ReverseString();
		ob.reverse("sas");
		
		int i=0;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
	}
	public void reverse(String str)
	{
	
		String s = "";
		
		for(int i = str.length()-1; i>=0 ; i--) //in order to read string from last
		{
			s = s+ str.charAt(i);
		}
		//System.out.println(s);
		if(s==str)
		{
			System.out.println("string is palindrome");
		}
		else
			System.out.println("string is palindrome");

	}

}
