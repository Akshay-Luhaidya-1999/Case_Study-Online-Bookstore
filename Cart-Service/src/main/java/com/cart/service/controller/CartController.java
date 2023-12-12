package com.cart.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.service.model.Cart;
import com.cart.service.model.CartItemDTO;
import com.cart.service.serviceImpl.CartService;

@RestController
@RequestMapping("/carts")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	  @PostMapping("/{userId}/add")
	    public Cart addItemToCart(@PathVariable Long userId, @RequestBody CartItemDTO cartItemDTO) {
	        return cartService.addToCart(userId, cartItemDTO);
	    }

	    @GetMapping("/{userId}")
	    public Cart getCartByUserId(@PathVariable Long userId) {
	    	 return cartService.getCartByUserId(userId);
	    }
	      
}
