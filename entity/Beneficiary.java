package com.bank.software.entity;

import javax.persistence.*;

@Entity
@Table(name = "bene")

public class Beneficiary {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "bank_name")
    private String bankName;
    @OneToOne(mappedBy="act",cascade=CascadeType.ALL)
    @Column(name = "account_number")
    private int accountNumber;
    @OneToOne(mappedBy="user",cascade=CascadeType.ALL)
    @Column(name = "customer_Id")
    private int customerId;
    @Column(name = "max_Transfer_Limit")
    private int maxTransferLimit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getMaxTransferLimit() {
        return maxTransferLimit;
    }

    public void setMaxTransferLimit(int maxTransferLimit) {
        this.maxTransferLimit = maxTransferLimit;
    }
}
