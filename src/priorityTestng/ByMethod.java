package priorityTestng;

import org.testng.annotations.Test;

public class ByMethod {
	@Test
	public void getUrl() {
		System.out.println("Inside the URL");
	}
	@Test
	void EnterUnP() {
		System.out.println("Enter Valid Username & Password");
	}
		@Test(dependsOnMethods ="EnterUnP")
		void showpage() {
			System.out.println("ui is visible");
		}
	}
	

