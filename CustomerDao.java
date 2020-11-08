package demo_jdbc.model;

import java.util.*;
public interface CustomerDao {
	public void addCustomer(Customer customer);
	public void delCustomer(int id);
	public void updateCustomerPurchaseCapacity(int id, int purchaseCapacity);
	public List<Customer> getAllCustomer();
	public Optional<Customer> getCustomerByid(int id);
	public Optional<Customer> getCustomerByname(String name);
}