/**
 *
 */
package com.manning.sbia.ch04;

import java.io.Serializable;

/**
 * @author templth
 *
 */
public class Product implements Serializable {
	private String id;
	private String name;
	private String description;
	private float price;

	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	public float getPrice() { return price; }
	public void setPrice(float price) { this. price = price; }
}

