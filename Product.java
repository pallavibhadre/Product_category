package api;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	int id;
	String name;
	int price;

	public Product() {
		super();
	}

	public Product(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.price = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return price;
	}

	public void setAge(int age) {
		this.price = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + price + "]";
	}

}
