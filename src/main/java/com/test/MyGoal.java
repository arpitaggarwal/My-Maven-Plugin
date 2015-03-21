package com.test;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * 
 * @goal my-goal
 */
public class MyGoal extends AbstractMojo {
	final String username = "aggarwalarpit.89@gmail.com";
	final String password = "XXXX";
	final static Properties props = new Properties();
	static {
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
	}

	public void execute() throws MojoExecutionException {
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("aggarwalarpit.89@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("aggarwalarpit.89@gmail.com"));
			message.setSubject("Build Started");
			message.setText("Hey, Build Started!");
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}