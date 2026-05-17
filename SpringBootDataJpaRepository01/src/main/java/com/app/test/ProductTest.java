package com.app.test;

import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Product;
import com.app.repo.ProductRepo;

@Component
public class ProductTest implements CommandLineRunner {
	 @Autowired
     private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
		 Product p1 = new Product();
		 p1.setName("Mobile");
		 p1.setSerialNumber(23442);
		 p1.setMdate(new Date());
		 
		 Product p2 = new Product();
		 p2.setName("Tv");
		 p2.setSerialNumber(2342);
		 p2.setMdate(new Date());
		 
		 Product p3 = new Product();
		 p3.setName("BIke");
		 p3.setSerialNumber(23438);
		 p3.setMdate(new Date());
		 
		 
		 // save 
		     repo.save(p1);
		     
		     Optional<Product> p =   repo.findById(1);
		     if(p.isPresent()) {
		    	 System.out.println(p.get());
		     }
		     else {
		    	 System.out.println("Product not found");
		     }
		     
		  // save all
		     
//		     repo.saveAll(Arrays.asList(p1,p2,p3));
		 // save all and flush 
		     
//		     repo.saveAllAndFlush(Arrays.asList(p1,p2,p3));
		     
		     // save and flush 
		     
//		     repo.saveAndFlush(p2);
	}

}
