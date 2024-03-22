package include;

import org.testng.annotations.Test;

public class IncludeMethod {
	@Test
	void verify() {
		System.out.println("Page is verify");
	}
    @Test
    void Access() {
    	System.out.println("User Can access the Page");
    }
}
