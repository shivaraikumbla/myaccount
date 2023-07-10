package com.bank.software.services;

import com.bank.software.entity.Account;
import com.bank.software.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public String save(Account account) {

        accountRepository.save(account);
        return "save successfully";
    }
    public Account updateAccount(Account account){
        Account acct=accountRepository.save(account);
        return acct;
    }
    public List<Account> getAccounts(){
        //findall will return list of employee
        List<Account> accounts = accountRepository.findAll();
        return accounts;
    }

    //fetch the single employee
    public Account getAccounts(int id){
        Account acct1=accountRepository.findById(id).get();
        return acct1;

    }
    //for delete return type is void.if we display message then the return type as String
    public String deleteAcct(int id){
        accountRepository.deleteById(id);
        return "account is deleted as id :" +id;
    }

}