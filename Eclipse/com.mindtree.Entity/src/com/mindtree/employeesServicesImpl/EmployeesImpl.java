package com.mindtree.employeesServicesImpl;
import java.util.*;

import com.mindtree.EmployeesServices.EmployeesServices;
import com.mindtree.Entity.Employees;
public class EmployeesImpl implements EmployeesServices
{

	@Override
	public void displayAllTheEmployeesRecord(ArrayList<Employees> empArr) 
	{
		Iterator<Employees> itr=empArr.iterator();
		System.out.println("---------------All Employees--------------");
		while(itr.hasNext())
		{
		    Employees emp=itr.next();
		    System.out.println("ID: "+emp.getEmpID()+", Employee Name: "+emp.getEmpName()+", Salary: "+emp.getEmpSalary()+",Age: "+emp.getEmpAge());
		}
		
	}

	@Override
	public void displayEmployeesByDescendingOrder(ArrayList<Employees> empArr) 
	{
		Collections.sort(empArr,new DisplayByName());
		Iterator<Employees> itr=empArr.iterator();
		System.out.println("---------All Employees in descending order------------");
		while(itr.hasNext())
		{
			Employees emp=itr.next();
			System.out.println("ID: "+emp.getEmpID()+", Employee Name: "+emp.getEmpName()+",Salary: "+emp.getEmpSalary()+" Age: "+emp.getEmpAge());
		}
		
	}

	@Override
	public boolean updateEmployeeSalary(ArrayList<Employees> empArr, int empID) 
	{
		Scanner sc=new Scanner(System.in);
		boolean result =false;
		int size=empArr.size();
		Employees e=null;
		int Index=0;
		for(int i=0;i<size;i++)
		{
			if(empArr.get(i).getEmpID()==empID)
			{
				e=empArr.get(i);
				Index=i;
				break;
			}
		}
		
		int choice;
		System.out.println("Enter 1 for update salary\nEnter 2 for exit");	
		choice=sc.nextInt();
		 if(choice==2)
		 {
			 result=false;
		 }
		 else if(choice==1)
		 {
			 System.out.println("Enter salary:");
			 int salary=sc.nextInt();
			 e.setEmpSalary(salary);
			 empArr.set(Index, e);
			 result= true;
			 System.out.println("ID: "+e.getEmpID()+", Employee Name: "+e.getEmpName()+", Salary: "+e.getEmpSalary()+",Age: "+e.getEmpAge());
			 System.out.println();
		 }
		 else
		 {
			 System.out.println("Enter a valid input");
		 }
		return result;
	}
	

}
class DisplayByName implements Comparator<Employees>
{
	public int compare(Employees e1,Employees e2)
	{
		return e2.getEmpName().compareToIgnoreCase(e1.getEmpName());
	}
}
