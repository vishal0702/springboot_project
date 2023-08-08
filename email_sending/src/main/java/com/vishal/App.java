package com.vishal;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class App {
	public static void main(String[] args) {
		System.out.println("Preparing to send email");

		String message = "Hello Dear, This message is for security check";
		String subject = "A Message from Vishal Srivastava : Attachment";
		String to = "vishalsrivi@gmail.com";
		String from = "vishalsrivi123@gmail.com";

		// To send only text email
		// sendEmail(message, subject, to, from);

		// To send attachment
		sendAttach(message, subject, to, from);
	}

	// This method is for sending email with attachment
	private static void sendAttach(String message, String subject, String to, String from) {

		// variable for Gmail host
		String host = "smtp.gmail.com";

		// Get the system properties
		Properties properties = System.getProperties();
		System.out.println("System Properties: " + properties);

		// Set Host
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		// Step-1: To get the session object
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("vishalsrivi123@gmail.com", "zykpcbzkjcuedoju");
			}

		});

		session.setDebug(true);

		// Step-2: Compose the Message[text, multimedia]
		MimeMessage m = new MimeMessage(session);

		try {

			// From email
			m.setFrom(from);

			// Adding recipient to mail
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Adding subject to mail
			m.setSubject(subject);

			// Attachment
			//File Path
			String path="C:\\Users\\Dell\\Desktop\\vishal.jfif";
			
			MimeMultipart mimeMultipart = new MimeMultipart();
			
			//Text
			MimeBodyPart textMime = new MimeBodyPart();
			
			//File-Attachment
			MimeBodyPart fileMime = new MimeBodyPart();
			
			try {
				
				textMime.setText(message);
				
				File file = new File(path);
				fileMime.attachFile(file);
				
				mimeMultipart.addBodyPart(textMime);
				mimeMultipart.addBodyPart(fileMime);
				
				m.setContent(mimeMultipart);
				
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Step-3: Send mail
			Transport.send(m);

			System.out.println("Mail sent successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// This method is for sending email
	private static void sendEmail(String message, String subject, String to, String from) {

		// variable for Gmail host
		String host = "smtp.gmail.com";

		// Get the system properties
		Properties properties = System.getProperties();
		System.out.println("System Properties: " + properties);

		// Set Host
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		// Step-1: To get the session object
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("vishalsrivi123@gmail.com", "zykpcbzkjcuedoju");
			}

		});

		session.setDebug(true);

		// Step-2: Compose the Message[text, multimedia]
		MimeMessage m = new MimeMessage(session);

		try {

			// From email
			m.setFrom(from);

			// Adding recipient to mail
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Adding subject to mail
			m.setSubject(subject);

			// Adding text to mail
			m.setText(message);

			// Step-3: Send mail
			Transport.send(m);

			System.out.println("Mail sent successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
