package com.designpatterns.abstractfactory;

public class AppleProcessor implements Processor{

	private Storage storage;
	
	
	public AppleProcessor() {
		System.out.println("Intel processor is used for apple laptop");
	}

	@Override
	public void attachStorage(Storage storage) {
		this.storage = storage;
		System.out.println(storage+" is attached to the apple laptop");
	}

	@Override
	public void printSpecs() {
		System.out.println(this.toString());
	}

}
