package slf4jdemo;


import org.junit.Test;

public class CarServiceTest {

	@Test
	public void test() {
		CarService carService = new CarService();
		carService.process("Servicing my car in progress");
				
	}

}
