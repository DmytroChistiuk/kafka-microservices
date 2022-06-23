package com.example.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionDTO {
    private String name;
    private String account;
    private int money;
    private int id;

}
