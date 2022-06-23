package com.example.sms;

import org.apache.log4j.Logger;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@EnableKafka
@Service
public class SmsService {
    private static final Logger logger = Logger.getLogger(SmsService.class);
    @KafkaListener(topics = "transaction", groupId = "GROUP2!")
    public void sendSms(TransactionDTO transaction) {
        String message = "Transaction " + transaction.getName() + " was held on"+transaction.getAccount()+ " account\n";
        logger.info(message);
    }
}
