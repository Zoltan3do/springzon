package com.example.springzon.service;

import com.example.springzon.repository.ProductRepository;
import com.example.springzon.repository.ShoppingCartRepository;
import com.example.springzon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
     @Autowired
    private ShoppingCartRepository shoppingCartRepository;
     @Autowired
    private UserRepository userRepository;
     @Autowired
    private ProductRepository productRepository;


}
