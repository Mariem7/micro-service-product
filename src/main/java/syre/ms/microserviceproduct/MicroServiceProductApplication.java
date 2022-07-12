package syre.ms.microserviceproduct;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import syre.ms.microserviceproduct.entities.Product.Product;
import syre.ms.microserviceproduct.repositories.product.ProductRepository;

@SpringBootApplication
public class MicroServiceProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceProductApplication.class, args);
    }
    /*
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"PC",6000,3));
            productRepository.save(new Product(null,"Phone",6000,5));
            productRepository.save(new Product(null,"Car",100000,3));
            productRepository.findAll().forEach(p->{
                System.out.println(p.getName());
            });
        };
    }
    */

}
