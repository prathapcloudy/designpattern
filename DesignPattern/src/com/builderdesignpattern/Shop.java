package com.builderdesignpattern;

public class Shop {

	public static void main(String[] args) {

		Phone p = new PhoneBuilder().setOs("window").setProcessor("test").setRam(16).getPhone();
		System.out.println(p);

	}

}
