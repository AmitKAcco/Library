package com.example.demo.Service;

import com.example.demo.Model.TransactionHistory;
import com.example.demo.Repositry.TransactionHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TransationImplement implements TransationInterface {
    @Autowired
    private TransactionHistoryRepo transactionHistoryRepo;

    @Override
    public List<TransactionHistory> userHistroy(Long userId) {
        return transactionHistoryRepo.findByuserId(userId);
    }
}
