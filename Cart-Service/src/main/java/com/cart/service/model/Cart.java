package com.cart.service.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@Entity
@Table(name = "carts")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Cart(Long userId) {
		this.userId = userId;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Long id, Long userId, List<CartItem> items) {
		super();
		this.id = id;
		this.userId = userId;
		this.items = items;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CartItem> items = new ArrayList<>();

	// Constructors, getters, and setters
	 public void addItem(CartItem cartItem) {
	        items.add(cartItem);
	    }

}
