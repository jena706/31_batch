package priorityTestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityByNu {
	@Test(priority=2)
	public void getUrl() {
		System.out.println("Inside the URL");
	}
	@Test(priority=1)
	void EnterUnP() {
		System.out.println("Enter Vslid Username & Password");
	}
	@Test(priority=3)
	void PageAseccess() {
		System.out.println("User aseccsess the page");
	}

}
