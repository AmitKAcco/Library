package com.example.demo.Controller;

import com.example.demo.Model.TransactionHistory;
import com.example.demo.Model.Userr;
import com.example.demo.Service.TransationImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransationController {
    @Autowired
    private TransationImplement transationImplement;

    @GetMapping("/userHistory/{userId}")
    private List<TransactionHistory> getUser(@PathVariable Long userId){
        return  this.transationImplement.userHistroy(userId);
    }
}
