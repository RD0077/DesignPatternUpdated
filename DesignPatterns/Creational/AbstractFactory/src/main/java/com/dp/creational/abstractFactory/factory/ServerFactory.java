package com.dp.creational.abstractFactory.factory;

import com.dp.creational.abstractFactory.interf.AbstractComputerFactory;
import com.dp.creational.abstractFactory.interf.Computer;
import com.dp.creational.abstractFactory.interf.impl.Server;

public class ServerFactory  implements AbstractComputerFactory{
	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	
	public ServerFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
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
		return new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	}
}
