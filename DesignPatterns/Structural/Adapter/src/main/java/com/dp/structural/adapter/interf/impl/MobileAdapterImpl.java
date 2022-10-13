package com.dp.structural.adapter.interf.impl;

import com.dp.structural.adapter.interf.MobileAdapter;
import com.dp.structural.adapter.interf.WallSocket;
import com.dp.structural.adapter.model.Volt;

public class MobileAdapterImpl  implements MobileAdapter{

private WallSocket wallSocket;
	
	public MobileAdapterImpl(WallSocket wallSocket) {
		this.wallSocket = wallSocket;
	}

	public Volt get3Volt() {
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolts()/80;
		return new Volt(v3);
	}

}
