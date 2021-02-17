package com.saline.naton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saline.naton.queue.MessageSender;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class MensagemController {
	@Autowired
	MessageSender arquivoSender;

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Send a single message through queue") })
	@GetMapping(value = "/mensagem", produces = "application/json")
	public String enviaMensagem(@RequestBody String mensagem) {
		System.out.println("preparando envio da mensagem");

		arquivoSender.send(mensagem);

		return "mensagem enviada";
	}
}
