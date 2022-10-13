package com.dp.creational.abstractFactory.test;

import com.dp.creational.abstractFactory.factory.ComputerFactory;
import com.dp.creational.abstractFactory.factory.LaptopFactory;
import com.dp.creational.abstractFactory.factory.PCFactory;
import com.dp.creational.abstractFactory.factory.ServerFactory;
import com.dp.creational.abstractFactory.interf.Computer;

public class AbstractFactoryTest {
public static void main(String[] args) {
		
		//Client calls ComputerFactory to Create Computer with different configurations
		Computer pc = ComputerFactory.getComputer(new PCFactory("16 GB", "120 GB", "2,23 HGZ", true, true));
		System.out.println("PC Config::"+pc);
		
		Computer server = ComputerFactory.getComputer(new ServerFactory("32 GB", "320 GB", "2,29 HGZ", true, true));
		System.out.println("Server Config::"+server);
		
		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("16 GB", "140 GB", "2,23 HGZ", true, true));
		System.out.println("Laptop Config::"+laptop);
	}
}
