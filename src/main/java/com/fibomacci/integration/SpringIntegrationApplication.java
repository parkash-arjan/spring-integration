package com.fibomacci.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

	@Autowired
	private DirectChannel directChannel;

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		SpringApplication.run(SpringIntegrationApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Map<String, Object> map = new HashMap<>();
		// map.put("Key", "Value");
		// map.put("Parkash", "Arjan");
		//
		// MessageHeaders messageHeaders = new MessageHeaders(map);
		//
		// Message<String> message = new GenericMessage<String>("Hello Spring
		// Integration.. This is generci Message....",messageHeaders);
		// PrintService service = new PrintService();
		// service.printMessage(message);

		// Message<String> message = MessageBuilder.withPayload("This is message
		// paylod...").setHeader("headerKey", "headerValue").build();
		// PrintService service = new PrintService();
		// service.printMessage(message);

		// directChannel.subscribe(new MessageHandler() {
		//
		// @Override
		// public void handleMessage(Message<?> message) throws MessagingException {
		// new PrintService().printMessage((Message<String>) message);
		// }
		// });
		// Message<String> message = MessageBuilder.withPayload("This is message
		// paylod...").setHeader("headerKey", "headerValue").build();
		// directChannel.send(message);

		Message<String> message = MessageBuilder.withPayload("This is message paylod...").setHeader("headerKey", "headerValue").build();
		directChannel.send(message);

	}
}
