package com.designpatterns.creational.abstractfactory;

public class DellProcessor implements Processor {

	private Storage storage;

	
	public DellProcessor() {
		System.out.println("AMD processor is used for Dell laptops");
	}

	@Override
	public void attachStorage(Storage storage) {
		this.storage = storage;
		System.out.println(storage + " is attached to the Dell  Laptops");
	}

	@Override
	public void printSpecs() {
		System.out.println(this.toString());
	}
}
