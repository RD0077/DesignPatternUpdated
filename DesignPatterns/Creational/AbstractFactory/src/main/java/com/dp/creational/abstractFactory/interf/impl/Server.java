package com.dp.creational.abstractFactory.interf.impl;

import com.dp.creational.abstractFactory.interf.Computer;

public class Server implements Computer {
	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	public Server(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	public String ram() {
		return this.ram;
	}

	public String hdd() {
		return this.hdd;
	}

	public String cpu() {
		return this.cpu;
	}

	public boolean isGraphicsEnabled() {
		return this.isGraphicsEnabled;
	}

	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}
