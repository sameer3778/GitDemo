package Simple;

public class StringHandle {

	public static void main(String[] args)
	{
		String str = "   sameer damodhar chavan   ";
		str =str.trim();
		String arr[] = str.split(" ");
		System.out.println("length is: "+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("element at "+ i + " location: "+arr[i]);
		}
		
		System.out.println(arr[0]=arr[0].substring(0, 1).concat("."));
		

		
	}

}
