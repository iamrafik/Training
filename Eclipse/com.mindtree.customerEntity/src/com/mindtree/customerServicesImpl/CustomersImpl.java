package com.mindtree.customerServicesImpl;
import java.util.*;
import com.mindtree.customerEntity.Customers;
import com.mindtree.customerServices.customerServices;
public class CustomersImpl implements customerServices
{

	@Override
	public void displayAllTheCustomerData(ArrayList<Customers> cusArr) 
	{
		Iterator<Customers> itr=cusArr.iterator();
		System.out.println("---------------All Customers---------------");
		while(itr.hasNext())
		{
			Customers cus=itr.next();
			System.out.println("ID: "+cus.getCusID()+", Customer Name: "+cus.getCusName()+", Age: "+cus.getCusAge());
		}
		
	}

	@Override
	public void displayCustomersDescendingOrder(ArrayList<Customers> cusArr) 
	{
		Collections.sort(cusArr,new DisplayByName());
		Iterator<Customers> itr=cusArr.iterator();
		System.out.println("----------All Customers in descending order---------- ");
		while(itr.hasNext())
		{
			Customers cus=itr.next();
			System.out.println("ID: "+cus.getCusID()+", Customer Name: "+cus.getCusName()+", Age: "+cus.getCusAge());
		}
		
	}

	@Override
	public boolean updateCustomerAge(ArrayList<Customers> cusArr, int cusID) 
	{
		Scanner sc=new Scanner(System.in);
		boolean result=false;
		int size=cusArr.size();
		Customers c=null;
		int Index=0;
		for(int i=0;i<size;i++)
		{
			if(cusArr.get(i).getCusID()==cusID)
			{
				c=cusArr.get(i);
				Index=i;
				break;
			}
		}
		int choice;
		System.out.println("Enter 1 for update age\nEnter 2 for exit");	
		choice=sc.nextInt();
		 if(choice==2)
		 {
			 result=false;
		 }
		 else if(choice==1)
		 {
			 System.out.println("Enter age:");
			 int age=sc.nextInt();
			 c.setCusAge(age);
			 cusArr.set(Index, c);
			 result=true;
			 System.out.println("ID: "+c.getCusID()+", Customer Name: "+c.getCusName()+", Age: "+c.getCusAge());
			 System.out.println();
		 }
		 else
		 {
			 System.out.println("Enter a valid input");
		 }
		 return result;
	}
}
class DisplayByName implements Comparator<Customers>
{
	public int compare(Customers c1,Customers c2)
	{
		return c2.getCusName().compareToIgnoreCase(c1.getCusName());
	}
}
