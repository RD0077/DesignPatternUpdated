package com.dp.creational.abstractFactory.factory;

import com.dp.creational.abstractFactory.interf.AbstractComputerFactory;
import com.dp.creational.abstractFactory.interf.Computer;
import com.dp.creational.abstractFactory.interf.impl.Laptop;

public class LaptopFactory implements AbstractComputerFactory {
	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	public LaptopFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
 
	/**
	 * Overridden method of AbstractComputerFactory
	 * which returns reference of super interface Computer
	 */
	public Computer createComputer() {
		return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	}
}
