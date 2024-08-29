package in.nsti.alld.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailApplication {

	@Autowired
	  EmailSenderService EMS;

	public static void main(String[] args) {
		SpringApplication.run(MailApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	  public void sendMail() {
	    String to= "prachimsr1998@gmail.com";
	    String sub="Text springboot";
	    String body="Spring mail send";
	  
	    EMS.sendEmail(to, sub, body);
	  }

}
