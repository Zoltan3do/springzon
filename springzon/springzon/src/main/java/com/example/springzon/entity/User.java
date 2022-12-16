package com.example.springzon.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "User")
public class User {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
@Column
    private String username;
@Column
    private String email;
@Column
    private String password;

    @OneToOne(cascade = CascadeType.ALL, fetch =  FetchType.EAGER)
   @JoinColumn(name="ShoppingCart_id")
    private ShoppingCart idShoppingCart;

}
