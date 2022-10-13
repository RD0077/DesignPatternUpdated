package com.dp.structural.adapter.test;

import com.dp.structural.adapter.interf.MobileAdapter;
import com.dp.structural.adapter.interf.WallSocket;
import com.dp.structural.adapter.interf.impl.MobileAdapterImpl;
import com.dp.structural.adapter.interf.impl.WallSocketImpl;
import com.dp.structural.adapter.model.Volt;

public class AdapterTest {
/*
 * 
 * The Adapter design pattern falls one under structural design pattern
	It is used so that two unrelated interfaces can work together.
	The object that joins these unrelated interfaces is called an Adapter.
 */
	public static void main(String[] args){
		
		//Creating WallSocket Reference
		WallSocket wallSocket = new WallSocketImpl();
		//Generating 240 volts by default
		Volt v240 = wallSocket.getVolts();
		System.out.println(v240);
		
		//Creating MobileAdapter Reference
		MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
		//Generating 3 volts using Adapter design pattern
		Volt v3 = mobileAdapter.get3Volt();
		System.out.println(v3);
	}
}
