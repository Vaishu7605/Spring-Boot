package in.nsti.alld.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
  
  @Autowired
  JavaMailSender JMS;
  
  public void sendEmail(String to, String sub,String body) {
    SimpleMailMessage msg= new SimpleMailMessage();
    msg.setFrom("vaishnavikesherwani786@gmail.com");
    msg.setTo(to);
    msg.setSubject(sub);
    msg.setText(body);
    
    try {
      JMS.send(msg);
      System.out.println("mail sent to: "+ to);
    }
    catch(Exception e) {
      System.out.println("mail not send");
    }
  }
}

