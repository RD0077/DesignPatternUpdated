package com.dp.creational.singleton;

public enum SingletonUsingENUM {
	/**
	 * This Singleton can be access globally
	 */
	GETINSTANCE;
	
	public String welcome() {
		return "Singleton!!";
	}
}
