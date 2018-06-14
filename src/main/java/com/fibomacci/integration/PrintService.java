package com.fibomacci.integration;

import java.util.Map.Entry;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

public class PrintService {

	public void printMessage(Message<String> message) {

		MessageHeaders messageHeaders = message.getHeaders();

		for (Entry<String, Object> entry : messageHeaders.entrySet()) {
			System.out.println("Key = " + entry.getKey() +  " : " + " Value = " + entry.getValue());

		}
		System.out.println(message.getPayload());
	}
}
