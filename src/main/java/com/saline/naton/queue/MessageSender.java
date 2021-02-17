package com.saline.naton.queue;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

//	@Autowired
	private Queue queueProduct = new ActiveMQQueue("queue_product");
	
//	@Bean
//	public Queue queue() {
//		return new ActiveMQQueue("queue_company");
//	}

	public void send(String message) {		
		System.out.println("enviando mensagem para fila 'queue_product' " + message);
		this.jmsMessagingTemplate.convertAndSend(this.queueProduct, message);
		
	}
}