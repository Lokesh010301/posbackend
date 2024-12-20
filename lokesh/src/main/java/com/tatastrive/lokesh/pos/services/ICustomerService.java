package com.tatastrive.lokesh.pos.services;

import java.util.List;

import com.tatastrive.lokesh.pos.entity.Customer;



public interface ICustomerService {
	public Customer addCustomer(Customer customer);
	//public Customer addCountries(List<E>);
	public Customer getCustomer(long id);
	public List<Customer> getCustomers();
	public Customer updateCustomer(long id,Customer customer);
	public String  deleteCustomer(long id);

}
