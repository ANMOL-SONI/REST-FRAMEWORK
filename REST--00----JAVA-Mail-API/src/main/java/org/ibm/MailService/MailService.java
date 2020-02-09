package org.ibm.MailService;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailService {
	public static void main(String[] args) {
		try {
			String to = "anmol.soni@hotmail.com";
			String sub = "Hello";
			String text = "Hi";
//1. Email Properties
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", 587);
			props.put("mail.smtp.auth", true);
			props.put("mail.smtp.starttls.enable", true);
//2. user details (un/pwd)
			final String user = "paramesh.nit.12@gmail.com";
			final String pwd = "boot123456";
//3. Mail Session
			Session ses = Session.getInstance(props, new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(user, pwd);
				}
			});
//4. Create MimeMessage
			MimeMessage m = new MimeMessage(ses);
			m.setRecipient(RecipientType.TO, new InternetAddress(to));
			m.setSubject(sub);
			m.setText(text);
			m.setFrom(user);
//5. Send Message
			Transport.send(m);
			System.out.println("Mail Sent Successfully !!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
