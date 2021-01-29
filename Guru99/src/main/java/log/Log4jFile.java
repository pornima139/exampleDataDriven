package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import demo.Log4jDemo;

public class Log4jFile {
 static Logger log= LogManager.getLogger(Log4jFile.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n....Hello World....\n");
		log.trace("this is trace message");
		log.info("this is info message");
		log.error("this is error message");
		log.fatal("this is fatal message");
		log.warn("this is error message");
		
		System.out.println("\n....completed....\n");
	}

}
