package com.dp.creational.factory;

import com.dp.creational.factory.enumType.ComputerType;
import com.dp.creational.factory.interf.Computer;
import com.dp.creational.factory.interf.impl.Laptop;
import com.dp.creational.factory.interf.impl.PC;
import com.dp.creational.factory.interf.impl.Server;

public class ComputerFactory {
	private ComputerFactory() {

	}

	public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu,
			boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		switch (computerType) {
		case PC:
			return new PC(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		case SERVER:
			return new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		case LAPTOP:
			return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		default:
			throw new RuntimeException("Invalid Computer Type!!");
		}
	}
}
