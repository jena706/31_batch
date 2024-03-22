package groupingTest;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class GroupTest {
	@Test
	public void getUrl() {
		System.out.println("Inside the URL");
	}
	@Test (groups = "smoke")
	void EnterUnP() {
		System.out.println("Enter Vslid Username & Password");
	}
	@Test()
	void PageAseccess() {
		System.out.println("User aseccsess the page");
	}


}
