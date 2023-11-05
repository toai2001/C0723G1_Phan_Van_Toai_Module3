package com.example.crud.repo.impl;

import com.example.crud.model.Account;
import com.example.crud.repo.IAccountRepo;
import com.example.crud.utils.Baserepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;

public class AccountRepoImpl implements IAccountRepo {
    private static final String SELECT_BY_ID ="SELECT * FROM ACCOUNT WHERE ID_ACCOUNT = ?";
    @Override
    public Account findById(int id) {
        Baserepository baserepository = new Baserepository();
        Connection connection = baserepository.getConnection();
        Account account = null;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                int account_id = resultSet.getInt("id_account");
                String name = resultSet.getString("username");
                String pass=resultSet.getString("password");
                String type =resultSet.getString("type_account");
                account = new Account(account_id,name,pass,type);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return account;
    }
}
