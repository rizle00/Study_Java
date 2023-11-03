package pack02.email;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class Ex01_SendMail {
	Properties properties;// properties=> 파일을 읽어오기 위한 객체
	public Ex01_SendMail() {
		properties = new Properties();
		try {
			properties.load(Ex01_SendMail.class.getResourceAsStream("emailinfo.properties"));
			System.out.println(properties.getProperty("email.id"));
			System.out.println(properties.getProperty("email.pw"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws EmailException {
		Ex01_SendMail es = new Ex01_SendMail();
//		es.sendSimple();
		es.htmlMail();
	}
	
	public void htmlMail() throws EmailException {
		//파일 또는 url로 있는 이미지 등을 이메일 첨부
		EmailAttachment attatch = new EmailAttachment();
		attatch.setPath("D:\\Img/바다 노을.jpg");
		
		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);
		email.setFrom(properties.getProperty("email.id"));
		email.addTo("youngmoon525@naver.com");
		email.setSubject("TestMail11");
//		email.setMsg("This is a test mail ... :-)11");
		StringBuffer msg = new StringBuffer();
		msg.append("<html>");
		msg.append("<body>");
		msg.append("<a href='www.naver.com'>네이버</a>");
		msg.append("<img src='https://cdn.pixabay.com/photo/2023/05/05/21/00/cute-7973191_1280.jpg' alt='mouse'>");
		msg.append("<img src='https://cdn.pixabay.com/photo/2023/04/29/04/54/animal-7957726_640.jpg' alt='fox'>");
		msg.append("</body>");
		msg.append("</html>");
		
		email.setHtmlMsg(msg.toString());//기존은 setMsg(x) => setHtmlMsg
		email.attach(attatch);
		attatch = new EmailAttachment();// 기존에 컴퓨터에서 추가한 파일을 비우고 다시 만들기
		 try {
			attatch.setURL(new URL("https://cdn.pixabay.com/photo/2023/05/05/21/00/cute-7973191_1280.jpg"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		email.send();
	}
	
	public void sendSimple() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);
		email.setFrom(properties.getProperty("email.id"));
		email.addTo(properties.getProperty("email.id"));
		email.addTo("kain3558@naver.com");
		email.setSubject("TestMail11");
		email.setMsg("This is a test mail ... :-)11");
		email.send();
	}
	
	public void attachMail() throws EmailException {
		// Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("D:\\Img/바다 노을.jpg");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Picture of 바다 노을");
		  attachment.setName("Pic");

		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  	email.setHostName("smtp.naver.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
			email.setSSLOnConnect(true);
			email.setFrom(properties.getProperty("email.id"));
			email.addTo(properties.getProperty("email.id"));
			email.addTo("kain3558@naver.com");
			email.setSubject("TestMail11");
			email.setMsg("This is a test mail ... :-)11");

		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();
	}
}
