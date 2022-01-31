package com.designpatterns.creational.abstractfactory;

public class DellStorage implements Storage{

	private int storageSize;
	@Override
	public void getType() {
		System.out.println("HDD");
		
	}
	
	public DellStorage(int storageSize) {
		this.storageSize = storageSize;
		System.out.println(storageSize+" GB HDD will be used");
	}

	@Override
	public String toString() {
		return storageSize+ " GB Hard disk";
	}
	
}
