package com.mythreads.mythreads;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MythreadsApplication {
	final static Log logger = LogFactory.getLog(MythreadsApplication.class);

	public static void main(String[] args) {
		logger.info("Entering main@MythreadsApplication");

		SpringApplication.run(MythreadsApplication.class, args);
/*		ExecutorService executor = Executors.newFixedThreadPool(5);
    Runnable worker = new MyThread(100, "Vinod Kumar");
		executor.execute(worker);*/

    String encryptedString = "nrfbq";
    UnencryptText unencryptText = new UnencryptText();
    logger.info("Encrypted text: "+encryptedString);
    logger.info("Unencrypted text: "+unencryptText.getUnencryptedText(encryptedString));


    int n = 798;
    PrimeNumbers primaryNumbers = new PrimeNumbers();
    logger.info("Primary number at position, "+n+" is " +primaryNumbers.findPrimaryNumber(n));

		//executor.shutdown();
		logger.info("Exiting main@MythreadsApplication");

	}
}