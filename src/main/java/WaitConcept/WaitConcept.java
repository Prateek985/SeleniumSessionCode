package WaitConcept;

public class WaitConcept {

	public static void main(String[] args) {
		
		//script  ------ Synchronization ----- app/websites(slow, server, slowness, network)
		
		// Synck: wait
		// 1. static wait: JAVA Thread.sleep(10000); 10 secs: 2 secs
		// 2. dynamic wait: 10 sec: 2sec: 8 secs will be cancelled.
		
		//2. a. Implicit wait ----> Global wait: applied to all the elements by default
		//2. b. Explicit wait ----> its applied for a specific web element
		        // 1. WebDriver Wait (C)
		        // 2. Fluent Wait (C)
		      
		// wait(interface) : ---- until(method); ---> implements ---> Fluent wait (C) --> it has until method + others method ---> webDriverwait(C)
		

	}

}
