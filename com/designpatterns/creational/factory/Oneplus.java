package com.designpatterns.creational.factory;

public class Oneplus implements Mobile{
	private int ramSize;
	private String processor;
	
	public Oneplus(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
		System.out.println("oneplus mobile created");
	}

	@Override
	public String toString() {
		return "Oneplus{" +
				"ramSize=" + ramSize +
				", processor='" + processor + '\'' +
				'}';
	}
}
