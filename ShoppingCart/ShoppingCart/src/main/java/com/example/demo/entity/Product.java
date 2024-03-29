package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;



@Entity
@Table(name="product_table")
@SequenceGenerator(name = "generator2", sequenceName = "gen2", initialValue = 5000)
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator2")
	@Column(name="product_id")
	private long productId;
	
	@NotEmpty(message = "Product name is required.")
    @Column(name = "productname", nullable = false, length = 20)
	private String productname;

	@Column(name="product_image")
	@NotEmpty
	private String image;
//	


	@NotEmpty(message = "Product description is required.")
	@Column(name = "description", nullable = false)
	private String description;	
	
	//@Column(name = "mrp_price", nullable = false, precision = 10, scale = 2)
    private double mrpPrice;
	
//	//@Size(min = 2, max = 10)
//		@Column(name = "price", nullable = false, precision = 10, scale = 2)
//	    private double price;
//	
	@Column(name = "quantity")
	private long quantity;
	
//	@Column(name = "cart_id")
//	private long cartId;
	
	private Category category;
	
	@Column(name = "measurment")
	private String measurment;
	
public String getMeasurment() {
		return measurment;
	}

	public void setMeasurment(String measurment) {
		this.measurment = measurment;
	}

public Product() {
		
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMrpPrice() {
		return mrpPrice;
	}

	public void setMrpPrice(double mrpPrice) {
		this.mrpPrice = mrpPrice;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productname=" + productname + ", description=" + description
				+ ", mrpPrice=" + mrpPrice + ", quantity=" + quantity + "]";
	}

}