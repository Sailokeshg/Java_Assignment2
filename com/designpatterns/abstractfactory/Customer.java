package com.designpatterns.abstractfactory;

public class Customer {

	public static void main(String[] args) {

		Processor dellProcessor = createProcessor(new DellFactory(1024));
		dellProcessor.printSpecs();

		System.out.println("---------------------------------");

		Processor appleProcessor = createProcessor(new AppleFactory(1024));
		appleProcessor.printSpecs();

	}

	private static Processor createProcessor(LaptopFactory laptopFactory) {

		Processor processor = laptopFactory.createProcessor();
		Storage storage = laptopFactory.createStorage();
		processor.attachStorage(storage);
		return processor;
	}
}
