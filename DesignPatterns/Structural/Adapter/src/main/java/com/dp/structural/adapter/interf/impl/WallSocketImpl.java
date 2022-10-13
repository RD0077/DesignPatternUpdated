package com.dp.structural.adapter.interf.impl;

import com.dp.structural.adapter.interf.WallSocket;
import com.dp.structural.adapter.model.Volt;

public class WallSocketImpl implements WallSocket {

	public Volt getVolts() {
		// TODO Auto-generated method stub
		return new Volt(240);	}

}
