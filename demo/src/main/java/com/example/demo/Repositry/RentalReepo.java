package com.example.demo.Repositry;

import com.example.demo.Model.RentalHistory;
import com.example.demo.Model.Review;
import com.example.demo.Model.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalReepo extends JpaRepository<RentalHistory, Long> {
    List<RentalHistory> findByuserId(Long userId);
}
