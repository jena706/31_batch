package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class A {
	@AfterSuite(enabled = false)
	public void m7() {
		System.out.println("This will execute AfterSuite");
	}
	@AfterClass
	public void m4() {
		System.out.println("This will Execute AfterClass");
	}
	@BeforeClass
	public void m5() {
		System.out.println("This will execute BeforeClass");
	}
	@BeforeSuite
	public void m6() {
		System.out.println("This is a Beforesuit");
	}
 @BeforeMethod
 public void m1() {
	 System.out.println("It will Execute BeforeMethod");
	  }
 @Test
 public void m2() {
	 System.out.println("It will execute as a Test");
	  }
 @AfterMethod
 public void M3() {
	 System.out.println("This will Execute After method");
 }
	 
   }
