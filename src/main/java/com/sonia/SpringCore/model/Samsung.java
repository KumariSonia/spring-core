package com.sonia.SpringCore.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //non qualified and decapatalized
public class Samsung {
	
	@Autowired
	@Qualifier("snapDragon")
	private MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config()
	{
		System.out.println("samsung fetures given...");
		cpu.process();
	}

}
