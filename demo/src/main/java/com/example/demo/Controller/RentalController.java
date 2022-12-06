package com.example.demo.Controller;

import com.example.demo.Model.RentalHistory;
import com.example.demo.Model.TransactionHistory;
import com.example.demo.Service.RentalImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RentalController {

    @Autowired
    private RentalImp rentalImp;

    @GetMapping("/rentalHistory/{userId}")
    private List<RentalHistory> getUser(@PathVariable Long userId){
        return  this.rentalImp.giveRental(userId);
    }
}
