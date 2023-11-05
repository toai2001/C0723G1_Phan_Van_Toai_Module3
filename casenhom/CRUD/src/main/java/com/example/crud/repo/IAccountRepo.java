package com.example.crud.repo;

import com.example.crud.model.Account;

import java.util.List;

public interface IAccountRepo {
    Account findById(int id);

}
