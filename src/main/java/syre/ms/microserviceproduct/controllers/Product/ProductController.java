package syre.ms.microserviceproduct.controllers.Product;

import org.springframework.web.bind.annotation.*;
import syre.ms.microserviceproduct.entities.Product.Product;
import syre.ms.microserviceproduct.repositories.product.ProductRepository;

import java.util.List;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Get All Products
    @GetMapping(path = "/products")
    public List<Product> list(){
        return productRepository.findAll();
    }

    //Get Product By Id
    @GetMapping(path = "/products/{productId}")
    public Product getProduct(@PathVariable("productId") Long productId){
        return productRepository.findById(productId).get();
    }

    //Save Product
    @PostMapping(path = "/products")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    //Update Product
    @PutMapping(path = "/products/{productId}")
    public Product updateProduct(@PathVariable("productId") Long productId, @RequestBody Product product){
        product.setProductId(productId);
        return productRepository.save(product);
    }

    //Delete Product
    @DeleteMapping(path = "/products/{productId}")
    public void deleteProduct(@PathVariable("productId") Long productId){
        productRepository.deleteById(productId);
    }


}
