package in.vitthal.java7legacy;

import java.util.Iterator;
import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String firstName, String lastName, int age) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "First Name: "+getFirstName()+"\tLast Name:"+getLastName()+"\t Age:"+getAge();
		
	}
}
