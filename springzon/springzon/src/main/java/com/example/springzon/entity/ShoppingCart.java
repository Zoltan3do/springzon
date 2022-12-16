package com.example.springzon.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name= "ShoppingCart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idShoppingCart;

    @OneToOne(mappedBy = "idShoppingCart", fetch= FetchType.EAGER)
    private User user;

    @OneToMany(mappedBy = "shoppingCart", fetch = FetchType.EAGER)
   // @JoinColumn(name = "product")
    private List<Product> listProduct;

}
