package user;

import java.util.Scanner;

public class Person implements InputInfor{
	protected String fullName;
	protected String address;
	protected int phoneNumber;
	
	public Person() {
		
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void inputInfor() {
		System.out.print("Nhap ho vâ Ten: ");
		this.setFullName(new Scanner(System.in).nextLine());
		System.out.print("Nhap dia chỉ: ");
		this.setAddress(new Scanner(System.in).nextLine());
		System.out.print("Nhập sdt:");
		this.setPhoneNumber(new Scanner(System.in).nextInt());
		
	}
	
	
	
	
	
	
}
