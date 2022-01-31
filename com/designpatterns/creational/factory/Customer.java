package com.designpatterns.creational.factory;

public class Customer {
	 public static void main(String[] args) {

		 MobileFactory factory = new MobileFactory();

		 Mobile mobileOne = factory.orderMobile(Mobile.SAMSUNG);
		 System.out.println(mobileOne);

		 System.out.println("\n");

		 Mobile mobileTwo = factory.orderMobile(Mobile.ONEPLUS);
		 System.out.println(mobileTwo);

	}
}
