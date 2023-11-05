package com.example.crud.repo.impl;

import com.example.crud.model.Account;
import com.example.crud.model.Reader;
import com.example.crud.repo.IAccountRepo;
import com.example.crud.repo.IReaderRepo;
import com.example.crud.utils.Baserepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderRepoImpl implements IReaderRepo {
    private final IAccountRepo accountRepo = new AccountRepoImpl();
    private static final String SELECT_ALL = "SELECT * FROM reader;";
    private static final String FIND_BY_ID = "SELECT * FROM reader WHERE reader_id = ?;";
    private static final String REMOVE_READER_BY_ID = "DELETE FROM reader WHERE reader_id = ?;";
    private final static String READER = "INSERT INTO reader (reader_id, reader_name, address, citizen_id, date_of_birth, email , phone_number, image,id_account) VALUES (?,?,?,?,?,?,?,?,?);\";\n";

    @Override
    public List<Reader> listReadable() {
        Baserepository baserepository = new Baserepository();
        Connection connection = baserepository.getConnection();
        List<Reader> readerList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL);
            while (resultSet.next()) {
                int id = resultSet.getInt("reader_id");
                String name = resultSet.getString("reader_name");
                String address = resultSet.getString("address");
                String citizenId = resultSet.getString("citizen_id");
                String dateOfBirth = resultSet.getString("date_of_birth");
                String email = resultSet.getString("email");
                String phoneNumber = resultSet.getString("phone_number");
                String image = resultSet.getString("image");
                Account accountId = accountRepo.findById(resultSet.getInt("id_account"));
                readerList.add(new Reader(id, name, address, citizenId, dateOfBirth, email, phoneNumber, image, accountId));
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return readerList;
    }

    @Override
    public Reader findById(int idReader) {
        Baserepository baserepository = new Baserepository();
        Connection connection = baserepository.getConnection();
        Reader reader = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1, idReader);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("reader_id");
                String name = resultSet.getString("reader_name");
                String address = resultSet.getString("address");
                String citizenId = resultSet.getString("citizen_id");
                String dateOfBirth = resultSet.getString("date_of_birth");
                String email = resultSet.getString("email");
                String phoneNumber = resultSet.getString("phone_number");
                String image = resultSet.getString("image");
                Account accountId = accountRepo.findById(resultSet.getInt("id_account"));
                reader = new Reader(id, name, address, citizenId, dateOfBirth, email, phoneNumber, image, accountId);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return reader;
    }

    @Override
    public boolean removeReader(int idReader) {
        if (findById(idReader) ==  null) {
            return false;
        }
        Baserepository baserepository = new Baserepository();
        Connection connection = baserepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(REMOVE_READER_BY_ID);
            preparedStatement.setInt(1,idReader);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public void add(Reader reader) {

    }
}
