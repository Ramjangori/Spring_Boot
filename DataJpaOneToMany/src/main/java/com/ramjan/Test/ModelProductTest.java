package com.ramjan.Test;

import com.ramjan.entity.Model;
import com.ramjan.entity.Product;
import com.ramjan.repository.ModelRepo;
import com.ramjan.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ModelProductTest implements CommandLineRunner {
    @Autowired
    private ModelRepo modelRepo;
    @Autowired
    private ProductRepo productRepo;
    @Override
    public void run(String... args) throws Exception {

        Model m1 = new Model(1,"00023","sm");
        Model m2 = new Model(1,"00025","Pm");
        modelRepo.save(m1);
        modelRepo.save(m2);

        Product p1 = new Product(1,"Oppo", Arrays.asList(m1,m2));
        Product p2 = new Product (2,"Vivo",Arrays.asList(m1));

        productRepo.save(p1);
        productRepo.save(p2);



    }
}
