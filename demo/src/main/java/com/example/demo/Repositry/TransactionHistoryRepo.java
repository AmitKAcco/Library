package com.example.demo.Repositry;

import com.example.demo.Model.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionHistoryRepo extends JpaRepository<TransactionHistory, Long> {
     List<TransactionHistory> findByuserId(Long userId);
}
