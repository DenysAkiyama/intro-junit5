package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreatingTest extends Greating {

	private Greating greating;
	
	@BeforeEach
	void setUpTesting () {
		System.out.println("Antes de cada teste . . .");
		greating = new Greating();
	}
	
	@Test
	void HelloWorld() {
		
		System.out.println(greating.helloWorld());
	}

	@Test
	void helloWorld1() {
		
		System.out.println(greating.helloWorld("Denys"));
	}
}
