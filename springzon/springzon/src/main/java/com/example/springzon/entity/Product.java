package com.example.springzon.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idProduct;

    @Column
    private String name;
  //  @Column
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="description_id")
    private Description description;
    @ManyToOne(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ShoppingCart_id")
    private ShoppingCart shoppingCart;
}
