package com.retail.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Service
@Path("/customer")
public class CustomerService {

	Map<Integer, Customer> customers = new HashMap<Integer, Customer>();
	
	public CustomerService() {
		customers.put(1,new Customer(1, "Joe"));
		customers.put(2,new Customer(2, "Akta"));
		customers.put(3,new Customer(3, "Justin"));
		customers.put(4,new Customer(4, "Omen"));
	}
	
	@Path("/{customerId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerProfile(@PathParam("customerId") int customerId){
		return customers.get(customerId);
		
	}
}
