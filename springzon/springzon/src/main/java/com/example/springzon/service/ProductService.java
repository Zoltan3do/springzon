package com.example.springzon.service;

import com.example.springzon.entity.Description;
import com.example.springzon.entity.Product;
import com.example.springzon.entity.ShoppingCart;
import com.example.springzon.repository.DescriptionRepository;
import com.example.springzon.repository.ProductRepository;
import com.example.springzon.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private DescriptionRepository descriptionRepository;
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

//crud

    //read all-> ritorna la lista di prodotti
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    //read per id
    public Product getProduct(Long id){
        return productRepository.getReferenceById(id);
    }
    //create

    public Product addProduct(Product prodotto){
        return productRepository.save(prodotto);
       //descriptionRepository.save(prodotto.getDescription());
    }
    //update
    public Product updateProduct(Long id, Product prodotto) {
            prodotto.setIdProduct(id);
           return productRepository.save(prodotto);
    }

    //delete
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }


}
