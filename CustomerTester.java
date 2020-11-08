package demo_jdbc.contoller;

import java.sql.Connection;
import java.util.*;
import java.util.function.Supplier;

import demo_jdbc.Exception.CustomerNotFoundException;
import demo_jdbc.model.ConnectionFactory;
import demo_jdbc.model.Customer;
import demo_jdbc.model.CustomerDao;
import demo_jdbc.model.CustomerDaoImplementation;

import java.util.*;
public class CustomerTester {
	public static void main(String[] args) {
		
		Connection connection=ConnectionFactory.getConnection();
		if(connection!=null)
			System.out.println("success");
		
		
	
		
		CustomerDao dao=new CustomerDaoImplementation();
		
		
		List<Customer> customer=dao.getAllCustomer();
		customer.forEach(n-> System.out.println(n));
		
		
		
		dao.delCustomer(1);
		
		
		
		dao.updateCustomerPurchaseCapacity(2,500);
		System.out.println("updated.....");
		
	
	
		
		Customer customer1=dao.getCustomerByid(2).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
	System.out.println(customer1);
	
		
	Customer customer2=dao.getCustomerByname("raj").orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
		
	System.out.println(customer2);
		
	
	Customer customer3=new Customer("kaj", "988523", "kaj@gmail.com", new Date(), 150);
	dao.addCustomer(customer3);

	}

}
