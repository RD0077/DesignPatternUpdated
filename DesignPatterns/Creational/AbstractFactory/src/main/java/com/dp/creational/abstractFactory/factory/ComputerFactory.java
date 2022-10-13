package com.dp.creational.abstractFactory.factory;

import com.dp.creational.abstractFactory.interf.AbstractComputerFactory;
import com.dp.creational.abstractFactory.interf.Computer;

public class ComputerFactory {
	private ComputerFactory() {
		 
	}
	
	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
		return abstractComputerFactory.createComputer();
	}
}
