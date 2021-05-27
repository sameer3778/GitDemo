package TestNg;

import org.testng.annotations.Test;

public class TestEx 
{
	@Test(priority = 0)
	public void first()
	{
		System.out.println("first method");
	}
	@Test(priority = 1)
	public void good()
	{
		System.out.println("good method");
	}
	
	@Test(priority = 2)
	public void egg()
	{
		System.out.println("egg method");
	}
	
	@Test(priority = 3)
	public void add()
	{
		System.out.println("add method");
	}

	@Test(priority = 4)
	public void jkl()
	{
		System.out.println("jkl method");
	}
	@Test(priority = 5)
	public void bcd()
	{
		System.out.println("bcd method");
	}
}
