package com.example.transaction;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;

@Service
public class TransactionService {
    private static final Logger logger = Logger.getLogger(TransactionService.class);
    @Autowired
    private KafkaTemplate<Object, TransactionDTO> template;


    public void writeTransaction(TransactionDTO transaction) throws InterruptedException {
        String start = "Transaction with id = " + transaction.getId() + " is processing ...\n";
        String end = "Transaction " + transaction.getName() + " ended.\n" +
                transaction.getMoney() + "$ was successfully added to " + transaction.getAccount() + " account!";
        logger.info(start);
        Thread.sleep(5000);
        logger.info(end);
        template.send("transaction",transaction);
    }
}
