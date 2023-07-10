package com.bank.software.entity;

import javax.persistence.*;

@Entity
@Table(name = "act")
public class Account {
    @Id
    //craete the id automatically inside db
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true)
  //  @size(max=10,message="Enter 10 digit unique account number")
    private int id;
    @OneToOne(mappedBy="user",cascade=CascadeType.ALL)
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "currency")
    private String currency;
    @Column(name = "category")
    private int category;
    @OneToOne(mappedBy="user",cascade=CascadeType.ALL)
    @Column(name = "account_officer_id")
    private String accountOfficerId;
    @Column(name = "account_open_date")
    private int accountOpenDate;
    @Column(name = "account_balance")
    private int accountBalance;
    @Column(name = "record_status")
    private String recordStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getAccountOfficerId() {
        return accountOfficerId;
    }

    public void setAccountOfficerId(String accountOfficerId) {
        this.accountOfficerId = accountOfficerId;
    }

    public int getAccountOpenDate() {
        return accountOpenDate;
    }

    public void setAccountOpenDate(int accountOpenDate) {
        this.accountOpenDate = accountOpenDate;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }
}
