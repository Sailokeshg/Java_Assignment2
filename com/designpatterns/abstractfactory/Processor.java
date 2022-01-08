package com.designpatterns.abstractfactory;

public interface Processor {

	void attachStorage(Storage storageType);
	void printSpecs();
}
