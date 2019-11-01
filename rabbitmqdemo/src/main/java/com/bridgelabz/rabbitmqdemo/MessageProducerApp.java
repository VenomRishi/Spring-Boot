package com.bridgelabz.rabbitmqdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageProducerApp {
	private static final String QUEUE_NAME = "rabbitmqtest";

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RabbitmqConfig.class);
		RabbitTemplate rabbitTemplate = context.getBean("rabbitTemplate", RabbitTemplate.class);

		rabbitTemplate.convertAndSend(QUEUE_NAME, "Hello world");
		System.out.println("send success");
		context.close();
	}
}
