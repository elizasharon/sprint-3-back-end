package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
	
	private Logger log = LoggerFactory.getLogger(CarService.class);
	public void process(String msg) {
		if(log.isDebugEnabled())
			log.debug("Processing car : "+msg);
		log.info("Car INFO");
		log.error("Car ERROR ");
//		System.out.println("Processed Car!");
	}
		
}
