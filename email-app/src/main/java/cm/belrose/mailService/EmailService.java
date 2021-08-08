package cm.belrose.mailService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailService {

    public void sendEmail(){
        log.info("####Inside the email-app module and the EmailService class ######");
    }
}
