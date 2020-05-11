package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreatingTest extends Greating {

	private Greating greating;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Antes de tudo - iniciado apenas uma vez!!!");
	}
	
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
	
	@Test
	void helloWorld2() {
	
		System.out.println(greating.helloWorld("Daniel"));
		
	}
	
	@AfterEach
	void tearDown() {
		
		System.out.println("Depois de cada teste . . .");
		
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("=========Depois de tudo - iniciado apenas uma vez!!!============");
	}
}
