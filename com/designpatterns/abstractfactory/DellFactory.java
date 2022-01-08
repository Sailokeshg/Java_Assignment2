package com.designpatterns.abstractfactory;

public class DellFactory implements LaptopFactory{

	private int storageSize;
	
	
	public DellFactory(int storageSize) {
		this.storageSize = storageSize;
	}

	@Override
	public Processor createProcessor() {
		return new DellProcessor();
	}

	@Override
	public Storage createStorage() {
		return new DellStorage(storageSize);
	}

}
