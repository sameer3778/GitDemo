package Simple;

public class ChildEncapsulation extends Encapsulation{

	public static void main(String[] args) {
		

		ChildEncapsulation c = new ChildEncapsulation();
		
		//c.set(20);
		int o = c.get();
		System.out.println("output is:"+o);
	}

}
