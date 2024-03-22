package priorityTestng;

import org.testng.annotations.Test;

public class ByASCII {
	@Test(priority = 'K')
	public void getUrl() {
		System.out.println("Inside the URL");
	}
	@Test(priority = 'j')
	void EnterUnP() {
		System.out.println("Enter Vslid Username & Password");
	}
	@Test(priority='N')
	void PageAseccess() {
		System.out.println("User aseccsess the page");
	}

}
