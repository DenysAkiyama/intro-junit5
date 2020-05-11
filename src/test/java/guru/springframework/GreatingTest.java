package guru.springframework;

import org.junit.jupiter.api.Test;

class GreatingTest extends Greating {

	@Test
	void HelloWorld() {
		Greating greating = new Greating();
		
		System.out.println(greating.helloWorld());
	}

	@Test
	void helloWorld1() {
		Greating greating = new Greating();
		
		System.out.println(greating.helloWorld("Denys"));
	}
}
