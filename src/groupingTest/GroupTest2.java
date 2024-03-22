package groupingTest;

import org.testng.annotations.Test;

public class GroupTest2 {
	@Test
	public void pagevisible() {
		System.out.println("page is visible to the user");
	}
	
	@Test(groups = "smoke")
	void order() {
		System.out.println("user can order the item");
	}

}
