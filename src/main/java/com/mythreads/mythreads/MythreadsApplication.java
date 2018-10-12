package com.mythreads.mythreads;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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




		//executor.shutdown();
		logger.info("Exiting main@MythreadsApplication");

	}
}