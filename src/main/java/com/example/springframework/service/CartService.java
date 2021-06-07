package com.example.springframework.service;

import com.example.springframework.component.Cart;
import com.example.springframework.component.Product;

import java.math.BigDecimal;
import java.util.List;

public interface CartService {

    Cart getNewCart();

    void addProduct(Cart cart, Product product, Integer quantity);
    void addProduct(Cart cart, Long prodId, Integer quantity);

//    void delProduct(Cart cart, Product product, Integer quantity);

    BigDecimal getSum(Cart cart);

    Integer getItemsAmount(Cart cart);

    void printCart(Cart cart);

    int getProductQuantity(Cart cart, Product product);
    int getProductQuantity(Cart cart, Long prodId);

    List<Product> getCartListSorted(Cart cart);
}
