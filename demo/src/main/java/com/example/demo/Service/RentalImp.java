package com.example.demo.Service;

import com.example.demo.Model.RentalHistory;
import com.example.demo.Repositry.RentalReepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RentalImp {
    @Autowired
    private RentalReepo rentalReepo;

    public List<RentalHistory> giveRental(Long userId){
        return rentalReepo.findByuserId(userId);
    }
}
