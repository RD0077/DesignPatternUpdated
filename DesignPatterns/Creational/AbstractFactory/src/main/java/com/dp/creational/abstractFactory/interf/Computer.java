package com.dp.creational.abstractFactory.interf;

public interface Computer {
	public abstract String ram();
	public abstract String hdd();
	public abstract String cpu();
	
	public boolean isGraphicsEnabled();
	public boolean isBluetoothEnabled();
}
