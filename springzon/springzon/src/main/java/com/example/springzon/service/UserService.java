package com.example.springzon.service;

import com.example.springzon.entity.Product;
import com.example.springzon.entity.ShoppingCart;
import com.example.springzon.entity.User;
import com.example.springzon.repository.DescriptionRepository;
import com.example.springzon.repository.ProductRepository;
import com.example.springzon.repository.ShoppingCartRepository;
import com.example.springzon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private DescriptionRepository descriptionRepository;
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    @Autowired
    private UserRepository userRepository;

//crud

    //read all-> ritorna la lista di prodotti
    public List<User> findAll(){
        return userRepository.findAll();
    }
    //read per id
    public User getUser(Long id){
        return userRepository.getReferenceById(id);
    }
    //create
    public User addUser(User user){
        return userRepository.save(user);
    }
    //update
    public User updateUser(Long id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        }
        else
            return null;
    }

    //delete
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


}
