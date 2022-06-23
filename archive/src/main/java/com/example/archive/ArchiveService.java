package com.example.archive;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;

@EnableKafka
@Service
public class ArchiveService {
    private static final Logger logger = Logger.getLogger(ArchiveService.class);
    @KafkaListener(topics = "transaction", groupId = "GROUP1!")
    public void addToArchive(TransactionDTO transaction) {
        String message = "Transaction with id = " + transaction.getId() + " add to archive ...\n";
        logger.info(message);
    }
}
