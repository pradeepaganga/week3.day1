package week3.day1;

import org.apache.poi.ss.formula.functions.Fixed;

public class BankInfo {

	int fixed;
	int deposit;
	public void savings() {
		// TODO Auto-generated method stub
		
		int savings=fixed+deposit;
		System.out.println(savings);

	}
	
	public void fixed()
	{
		 fixed=1000;
		 System.out.println(fixed);
		 
		 
	}
	
	public void deposit() {
		// TODO Auto-generated method stub
		deposit=1500;
		System.out.println(deposit);
	}
	
	}
