package com.bridgelabz.demo1;

public class DemoFundamental2 {
	
	
	public static void main(String[]args)
	{
		int n, cna=0, sum=0;
		System.out.println(args);
		for(int i=0; i<args.length; i++)
		{
			try
			{
				n=Integer.parseInt(args[i]);
				sum= sum+n;
			}
			catch (NumberFormatException e)
			{
				//system.out.println("invalid integer: ");
				cna++;
			}
		}
		System.out.println("Sum of Only Valid Integers: "+sum);
		System.out.println("Invalid Integers Are: "+cna);
	}

}
