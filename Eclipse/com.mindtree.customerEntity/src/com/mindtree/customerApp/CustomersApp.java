package com.mindtree.customerApp;
import java.util.*;
import com.mindtree.customerEntity.Customers;
import com.mindtree.customerServicesImpl.CustomersImpl;
public class CustomersApp 
{
	public static void main(String[] args) 
	{
		Customers cus=new Customers();
		Scanner sc=new Scanner(System.in);
		ArrayList<Customers> cusArr=new ArrayList<Customers>();
		CustomersImpl cl=new CustomersImpl();
		int choice;
		while(true)
		{
			System.out.println("Enter 1 to add customers\nEnter 2 to display all customers\nEnter 3 to display all customer in descending order\nEnter 4 to update customer age\nEnter 5 to exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("How many customers you want to add");
				int numofcus=sc.nextInt();
				for(int i=0;i<numofcus;i++)
				{
					System.out.println("Enter customer ID");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter customer name");
					String name=sc.nextLine();
					System.out.println("Enter customer age");
					int age=sc.nextInt();
					
					Customers cs=new Customers(id,name,age);
					cusArr.add(cs);
				}
				System.out.println("----------------------");
				break;
			case 2:
				cl.displayAllTheCustomerData(cusArr);
				System.out.println("-----------------");
				break;
			case 3:
				System.out.println("Display all customers by descending order");
				cl.displayCustomersDescendingOrder(cusArr);
				System.out.println("------------------------------------------");
				break;
			case 4:
				System.out.println("Enter employee ID: ");
				int id=sc.nextInt();
				boolean result=cl.updateCustomerAge(cusArr, id);
				if(result)
				{
					System.out.println("Age update succesfully");
				}
				else
				{
					System.out.println("Sorry, that customer ID not found");
				}
				System.out.println("-----------------------------------------");
				break;
			case 5:
				System.out.println("Thank You");
				System.exit(1);
			default:
				System.out.println("---------------------");
				System.out.println("Enter a valid input");
				System.out.println("------------------------");
			}
		}
	}
}
