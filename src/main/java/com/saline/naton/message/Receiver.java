package com.saline.naton.message;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class Receiver {
	private final CountDownLatch latch = new CountDownLatch(1);

	public void receiveMessage(String message) {
		Logger.getAnonymousLogger().log(Level.INFO, "Received {} ", message );
		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}
}
