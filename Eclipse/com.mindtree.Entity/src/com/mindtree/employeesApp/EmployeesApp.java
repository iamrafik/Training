package com.mindtree.employeesApp;
import java.util.*;
import com.mindtree.Entity.Employees;
import com.mindtree.employeesServicesImpl.EmployeesImpl;
public class EmployeesApp 
{

	public static void main(String[] args) 
	{
		Employees emp=new Employees();
		Scanner sc=new Scanner(System.in);
		ArrayList<Employees> empArr=new ArrayList<Employees>();
		EmployeesImpl el=new EmployeesImpl();
		int choice;
		while(true)
		{
			System.out.println("Enter 0 to add employees\nEnter 1 to display all employees\nEnter 2 to display all employees by descending order\nEnter 3 t update salary\nEnter 4 to exit ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("How many employees you want to add:");
				int numofemp=sc.nextInt();
				for(int i=0;i<numofemp;i++)
				{
					System.out.println("Enter employee ID");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter employee name");
					String name=sc.nextLine();
					System.out.println("Enter age");
					int age=sc.nextInt();
					System.out.println("Enter salary");
					int salary=sc.nextInt();
					
					Employees em=new Employees(id,name,age,salary);
					empArr.add(em);
				}
				System.out.println("------------------------------");
				break;
			case 1:
				el.displayAllTheEmployeesRecord(empArr);
				System.out.println("-------------------------------");
				break;
			case 2:
				System.out.println("Display all employees by descending order");
				el.displayEmployeesByDescendingOrder(empArr);
				System.out.println("------------------------------------------");
				break;
			case 3:
				System.out.println("Enter employee ID: ");
				int id=sc.nextInt();
				boolean result=el.updateEmployeeSalary(empArr, id);
				if(result)
				{
					System.out.println("Salary update succesfully");
				}
				else
				{
					System.out.println("Sorry, that employee ID not found");
				}
				System.out.println("-----------------------------------------");
				break;
			case 4:
				System.out.println("Thank You");
				System.exit(1);
			default :
				System.out.println("---------------------");
				System.out.println("Enter a valid input");
				System.out.println("------------------------");
					
			}		
		}
	}
}
