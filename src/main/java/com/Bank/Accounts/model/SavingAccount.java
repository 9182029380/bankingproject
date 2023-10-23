package com.Bank.Accounts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SavingAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String accountnumber;
    public String accountholdername;
    public String email;
    public String phonenumber;
    public double amount;
    public String address;


}
