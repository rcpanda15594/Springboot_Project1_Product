package com.test.product.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="items")
@Setter
@Getter
@Data
public class Items implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer itemId;
	
	@OneToMany
	private Order orderId;
	private String itemName;
	private float itemUnitPrice;
	private Integer itemQuantity;
}
