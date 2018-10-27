package com.spring.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.model.Customer;
import com.spring.model.PhoneNumber;
import com.spring.repo.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private CustomerRepository repository;
	
	@Test
	public void testSave() {
		Customer customer = new Customer();
		customer.setName("customer1");
		Set<PhoneNumber> phoneNumberSet=new HashSet<>();
		
		PhoneNumber p1=new PhoneNumber();
		p1.setNumber("9986182794");
		p1.setType("home");
		p1.setCustomer(customer);
		PhoneNumber p2=new PhoneNumber();
		p2.setNumber("9986182794");
		p2.setType("home");
		p2.setCustomer(customer);
		phoneNumberSet.add(p1);phoneNumberSet.add(p2);
		customer.setPhoneNumbers(phoneNumberSet);
		
		repository.save(customer);
	}
	
	@Test
	public void testFindByName() {
		List<Customer> list=repository.findByName("Surajit");
		list.forEach(p->System.out.println(p.getId()+"\t"+p.getName()));
	}

}
