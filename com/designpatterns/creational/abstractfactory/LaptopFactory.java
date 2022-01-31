package com.designpatterns.creational.abstractfactory;

public interface LaptopFactory {

	Processor createProcessor();
	Storage createStorage();
}
