package com.lab;

import java.util.Scanner;

import com.lab.model.Employee;
import com.lab.services.CredentialsService;

public class Driver {
	public static void main(String[] args)
	{
		Employee emp=new Employee("Namrata","Chilwant");
	
		System.out.println("please enter the department from the following \n"
				+"1. Technical \n"
				+"2. Admin\n"
				+"3. Human Resource\n"
				+"4. Legal\n");
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		String department;
		
		switch (input)
		{
			case 1:
				department ="tech";
				break;
			case 2:
				department ="adm";
				break;
			case 3:
				department ="hr";
				break;
			case 4:
				department ="lgl";
				break;
				default:
					throw new IllegalArgumentException("Illegal Input"+input);
					
		}
		CredentialsService cs =new CredentialsService ();
		String email=cs.generateEmailAddress(emp, department);
		
	    String password=cs.generatePassword();
	    cs.showCrendential(emp.getfirstName(), password, email);
	}
	
}
