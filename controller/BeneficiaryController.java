package com.bank.software.controller;

import com.bank.software.entity.Account;
import com.bank.software.entity.Beneficiary;
import com.bank.software.services.AccountService;
import com.bank.software.services.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BeneficiaryController {
    @Autowired
    BeneficiaryService beneficiaryService;
    @PostMapping("/save")
    public String saveBeneficiary(@RequestBody Beneficiary beneficiary){
        return  beneficiaryService.save(beneficiary);

    }
    @PutMapping("/update/{id}")
    public Beneficiary updateBeneficiary(@RequestBody Beneficiary beneficiary,@PathVariable int id){
        return beneficiaryService.updateBeneficiary(beneficiary);

    }
    @GetMapping("/getAll")
    public List<Beneficiary> getAllBeneficiary(){
        return beneficiaryService.getBeneficiary();
    }

    @GetMapping("/get/{id}")
    public Beneficiary getBeneficiaryById(@PathVariable int id){
        return beneficiaryService.getBeneficiary(id);
    }

    @DeleteMapping("/delete/{id}")

    public String deleteBeneficiary(@PathVariable int id){
        return beneficiaryService.deleteBen(id);
    }


}
