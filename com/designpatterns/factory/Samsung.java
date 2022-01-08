package com.designpatterns.factory;

public class Samsung implements Mobile{
	private int ramSize;
	private String processor;
	public String name = Mobile.SAMSUNG;

	public Samsung(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Samsung(String processor){
		this.processor = processor;
		this.ramSize =2;
		System.out.println("Samsung mobile created");
	}

	@Override
	public String toString() {
		return "Samsung{" +
				"ramSize=" + ramSize +
				", processor='" + processor + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
