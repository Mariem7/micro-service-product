package syre.ms.microserviceproduct.entities.Product;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product implements Serializable{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long productId;
    private String name;
    private double price;
    private double quantity;
}
