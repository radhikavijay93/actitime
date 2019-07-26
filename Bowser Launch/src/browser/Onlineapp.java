package browser;

import java.util.Scanner;

public class Onlineapp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("browse app");
		String app=sc.next();
		if(app.equals("flipkart"))
			{
				Flipkart fp = (Flipkart) new Onlineapp();
				fp.browse();
			}
		else if(app.equals("myntra"))
			{
				Myntra mt = (Myntra) new Onlineapp();
				mt.browse();
			}
		
	}
}
