package com.bank.software.controller;


import com.bank.software.entity.Account;
import com.bank.software.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired

    AccountService accountService;
    //create the new resource inside the db
    @PostMapping("/save")
    public String saveAccount(@RequestBody Account account){
        return  accountService.save(account);

    }
    @PutMapping("/update/{id}")
    public Account updateAcc(@RequestBody Account account,@PathVariable int id){
        return accountService.updateAccount(account);

    }


    //get list of employee
    @GetMapping("/getAll")
    public List<Account> getAllEmployee(){
        return accountService.getAccounts();
    }

    @GetMapping("/get/{id}")
    public Account  getEmployeeById(@PathVariable int id){
        return accountService.getAccounts(id);
    }

    @DeleteMapping("/delete/{id}")

    public String deleteAcct(@PathVariable int id){
        return accountService.deleteAcct(id);
    }
}
