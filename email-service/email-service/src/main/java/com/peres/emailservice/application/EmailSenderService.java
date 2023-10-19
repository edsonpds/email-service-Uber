package com.peres.emailservice.application;

import com.peres.emailservice.adapters.EmailSenderGateway;
import com.peres.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;
    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
    this.emailSenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
    this.emailSenderGateway.senderEmail(to,subject,body);
    }
}
