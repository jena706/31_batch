package groupingTest;

import org.testng.annotations.Test;

public class GroupTest3 {
	@Test(groups = "smoke")
	void payment() {
		System.out.println("payment succsessfully");
	}

}
