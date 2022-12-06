package com.example.demo.Service;

import com.example.demo.Model.TransactionHistory;

import java.util.List;

public interface TransationInterface {
    List<TransactionHistory> userHistroy(Long userId);
}
