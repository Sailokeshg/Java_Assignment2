package com.designpatterns.creational.abstractfactory;

public interface Processor {

	void attachStorage(Storage storageType);
	void printSpecs();
}
