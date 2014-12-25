/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-25,下午03:14:11
 */
package mailtest;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/** 
 * @ClassName: MailTest 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-25 下午03:14:11 
 * 
 * @version 3.0.0 
 */
public class MailTest {
	
	
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		props.setProperty("mail.smtp.host", "smtp.126.com");
		 props.put("mail.smtp.auth", "true");
		Session session = Session.getInstance(props,  new MyAuthenticator("liuyazhou130@126.com", "286376568"));
		Message msg = new MimeMessage(session);
		Address send = new InternetAddress("liuyazhou130@126.com");
		Address from = new InternetAddress("liuyazhou130@126.com");
		msg.setContent("hello my mail " ,"test/plain");
		msg.setFrom(from);
		msg.setRecipient(Message.RecipientType.TO, send);
		msg.setSubject("you must comply");
		Transport.send(msg);
	}
	
}
