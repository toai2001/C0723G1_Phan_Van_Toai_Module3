package com.example.crud.model;

public class Reader {
    private int readeId;
    private String readerName;
    private String address;
    private String citizenId;
    private String dateOfBirth;
    private String email;
    private String phoneNumber;
    private String image;
    private Account account;

    public Reader() {
    }

    public Reader(String readerName, String address, String citizenId, String dateOfBirth, String email, String phoneNumber, String image, Account account) {
        this.readerName = readerName;
        this.address = address;
        this.citizenId = citizenId;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.account = account;
    }

    public Reader(int readeId, String readerName, String address, String citizenId, String dateOfBirth, String email, String phoneNumber, String image, Account account) {
        this.readeId = readeId;
        this.readerName = readerName;
        this.address = address;
        this.citizenId = citizenId;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.account = account;
    }

    public int getReadeId() {
        return readeId;
    }

    public void setReadeId(int readeId) {
        this.readeId = readeId;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
