package com.mindtree.customerServices;
import java.util.*;
import com.mindtree.customerEntity.Customers;
public interface customerServices 
{
	void displayAllTheCustomerData(ArrayList<Customers> cusArr);
	void displayCustomersDescendingOrder(ArrayList<Customers> cusArr );
	boolean updateCustomerAge(ArrayList<Customers> cusArr,int cusID);
}
