package com.designpatterns.creational.abstractfactory;

public class AppleStorage implements Storage {

	private int storageSize;
	@Override
	public void getType() {
		System.out.println("SSD");
		
	}
	public AppleStorage(int storageSize) {
		this.storageSize = storageSize;
		System.out.println(storageSize + " GB SSD is used with apple");
	}
	@Override
	public String toString() {
		return storageSize+ " GB Solid state device (SSD)";
	}
	
	

}
