package SerializationDeserialization;

import java.io.Serializable;

public class Student implements Serializable	{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	transient private String address; // transient key word will not save variable in file.
	private int age;
	
	
	public Student() {
		super();
	}
	public Student(String name, String email, String address, int age) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
