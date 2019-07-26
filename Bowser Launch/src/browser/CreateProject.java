package browser;

import org.testng.annotations.Test;

public class CreateProject 
{
@Test(priority=1)
public void createcustomerTest()
{
	System.out.println("execute create customer test");
}
@Test(priority=2)
public void modifycustoerTest()
{
	System.out.println("execute modify customer test");
}
@Test(priority=3)
public void deletecustomerTest()
{
	System.out.println("execute delete customer test");
}
	
}