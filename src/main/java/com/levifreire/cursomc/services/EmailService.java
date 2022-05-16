package com.levifreire.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.levifreire.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

}
