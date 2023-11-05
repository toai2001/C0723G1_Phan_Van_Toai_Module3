package com.example.crud.model;

public class Account {
    private int idAccount;
    private String username;
    private String pass;
    private String typeAccount;

    public Account() {
    }

    public Account(String username, String pass, String typeAccount) {
        this.username = username;
        this.pass = pass;
        this.typeAccount = typeAccount;
    }

    public Account(int idAccount, String username, String pass, String typeAccount) {
        this.idAccount = idAccount;
        this.username = username;
        this.pass = pass;
        this.typeAccount = typeAccount;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }
}
