package com.designpatterns.abstractfactory;

public interface LaptopFactory {

	Processor createProcessor();
	Storage createStorage();
}
