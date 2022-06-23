package com.example.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService service;

    @GetMapping(value = "/create")
    public ResponseEntity createTransaction(@RequestBody TransactionDTO transaction) throws InterruptedException {
        service.writeTransaction(transaction);
        return ResponseEntity.ok("added to the queue");
    }
}
