package com.bank.software.services;

import com.bank.software.entity.Account;
import com.bank.software.entity.Beneficiary;
import com.bank.software.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaryService {
    @Autowired
    BeneficiaryRepository beneficiaryRepository;

    public String save(Beneficiary beneficiary) {
beneficiaryRepository.save(beneficiary);

        return "save successfully";
    }
    public Beneficiary updateBeneficiary(Beneficiary beneficiary){
        Beneficiary ben=beneficiaryRepository.save(beneficiary);
        return ben;
    }
    public List<Beneficiary> getBeneficiary(){
        List<Beneficiary> beneficiaries = beneficiaryRepository.findAll();
        return beneficiaries;
    }
    public Beneficiary getBeneficiary(int id){
        Beneficiary ben1=beneficiaryRepository.findById(id).get();
        return ben1;

    }
    //for delete return type is void.if we display message then the return type as String
    public String deleteBen(int id){
      beneficiaryRepository.deleteById(id);
        return "ben details is deleted as id :" +id;
    }


}
