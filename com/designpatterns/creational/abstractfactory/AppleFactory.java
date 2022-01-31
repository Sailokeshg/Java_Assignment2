package com.designpatterns.creational.abstractfactory;

public class AppleFactory implements LaptopFactory {

	private int storageSize;
	
	
	public AppleFactory(int storageSize) {
		this.storageSize = storageSize;
	}

	@Override
	public Processor createProcessor() {
		return new AppleProcessor();
	}

	@Override
	public Storage createStorage() {
		return new AppleStorage(storageSize);
	}

}
