package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp {
	private static Logger logger = LoggerFactory.getLogger(MyApp.class);
	public static void main(String[] args) {

		logger.info("Bazinga");
		System.out.println("Result : "+ add(5, 6));
		
	}
	public static int add(int a, int b) {
		return a+b;
	}

}
