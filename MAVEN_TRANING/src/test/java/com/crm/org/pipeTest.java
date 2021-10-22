package com.crm.org;

import org.testng.annotations.Test;

public class pipeTest {

	@Test
	public void cmdtest()
	
	{
	String BROWSER = System.getProperty("browser");
		String URLL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URLL);
		
	}
}
