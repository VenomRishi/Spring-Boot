package com.bridgelabz.rabbitmqdemo;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageConsumerApp {
	//private static final String QUEUE_NAME = "rabbitmqtest";

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RabbitmqConfig.class);
		MessageReceiver receiver = context.getBean("receiver", MessageReceiver.class);
		receiver.getCountDownLatch().await(200000, TimeUnit.SECONDS);
		context.close();

	}
}
