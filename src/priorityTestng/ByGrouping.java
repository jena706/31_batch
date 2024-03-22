package priorityTestng;

import org.testng.annotations.Test;

public class ByGrouping {
	@Test(priority=2)
	public void getUrl() {
		System.out.println("Inside the URL");
	}
	@Test(priority=1)
	void EnterUnP() {
		System.out.println("Enter Vslid Username & Password");
	}
	@Test(priority=3 , groups = "smoke")
	void PageAseccess() {
		System.out.println("User aseccsess the page");
	}

}
