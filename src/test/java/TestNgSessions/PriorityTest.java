package TestNgSessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = 1)
	public void eTest() {
		System.out.println("e Test");
	}
	
	@Test(priority = 2)
	public void dTest() {
		System.out.println("e Test");
	}

	
	@Test(priority = 3)
	public void cTest() {
		System.out.println("e Test");
	}

	// if the priority for the method is -1 then first -1 will be run and then 0 priority method will be run
	@Test(priority = -1)
	public void aTest() {
		System.out.println("e Test");
	}

	
	// if we have not given any priority then by default the priority will be 0
	@Test
	public void bTest() {
		System.out.println("e Test");
	}

	

}
