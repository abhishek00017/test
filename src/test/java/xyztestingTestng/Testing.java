package xyztestingTestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {

	
	@Test(groups = {"retesting"})
	public void signin() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("retesting");
	}
	
	
	@Test(groups = "sanity")                        //enabled = false 
	public void signup() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("sanity");
	}
	
	
	@Test
	public void aftermethod() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("AfterMethod");
	}
	
	
	@BeforeMethod
	public void bfMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test(groups = {"sanity","retesting"})
	public void signout() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("signout");
	}
	
	
	@BeforeTest(enabled =false)
	public void beTest() {
		System.out.println("before test");
	}
	
}
