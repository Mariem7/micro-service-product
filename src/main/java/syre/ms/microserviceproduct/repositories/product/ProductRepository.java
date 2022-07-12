package syre.ms.microserviceproduct.repositories.product;

import org.springframework.data.jpa.repository.JpaRepository;
import syre.ms.microserviceproduct.entities.Product.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
