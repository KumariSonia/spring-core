package com.sonia.SpringCore.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTech implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
System.out.println("second best cpu");
	}

}
