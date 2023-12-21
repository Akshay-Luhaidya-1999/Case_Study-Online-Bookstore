package com.cart.service.serviceImpl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.service.model.Cart;
import com.cart.service.model.CartItem;
import com.cart.service.model.CartItemDTO;
import com.cart.service.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
    private CartRepository cartRepository;

	public Cart addToCart(Long userId, CartItemDTO cartItemDTO) {
        Cart cart = cartRepository.findByUserId(userId)
                                  .orElseGet(() -> new Cart(userId));

        CartItem cartItem = mapCartItemDTOToEntity(cartItemDTO);
        cart.addItem(cartItem);

        return cartRepository.save(cart);
    }

    public Cart getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId)
                             .orElseThrow(() -> new NoSuchElementException("Cart not found for user ID: " + userId));
    }

    // Helper method to map CartItemDTO to CartItem entity
    private CartItem mapCartItemDTOToEntity(CartItemDTO cartItemDTO) {
        CartItem cartItem = new CartItem();
        cartItem.setBookId(cartItemDTO.getBookId());
        cartItem.setTitle(cartItemDTO.getTitle());
        cartItem.setQuantity(cartItemDTO.getQuantity());
        cartItem.setPrice(cartItemDTO.getPrice());
        return cartItem;
    }
}

