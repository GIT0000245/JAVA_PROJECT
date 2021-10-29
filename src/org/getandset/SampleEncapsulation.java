package org.getandset;

import java.util.Scanner;

public class SampleEncapsulation {

	private int pincode;
	private String address;
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getPincode() {
		return pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {

		
		Scanner m = new Scanner(System.in);
		System.out.println("enter a age :");
		int age = m.nextInt();
		System.out.println("age: "+age);
		
		System.out.println("enter the name :");
		String name = m.next();
	
		System.out.println("\n");
		System.out.println("name :"+name);
		
		System.out.println("enter the pincode :");
		int pincode = m.nextInt();
		System.out.println("name :"+pincode);
		
		System.out.println("enter the address :");
		String address = m.next();
		System.out.println("name :"+address);
		
//		SampleEncapsulation s = new SampleEncapsulation();
//		s.setName("vishnu");
//		String name2 = s.getName();
//		System.out.println(name2);
//
//		s.setAge(27);
//		int usernage = s.getAge();
//		System.out.println(usernage);
//
//		s.setAddress("5/132");
//		String useradders = s.getAddress();
//		System.out.println(useradders);
//
//		s.setPincode(641654);
//
//		System.out.println("userpincode: " + s.getPincode());

	}

}
