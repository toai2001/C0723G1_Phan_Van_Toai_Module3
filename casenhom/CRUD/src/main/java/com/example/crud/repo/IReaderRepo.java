package com.example.crud.repo;

import com.example.crud.model.Reader;

import java.util.List;

public interface IReaderRepo {
    List<Reader> listReadable();
    Reader findById(int idReader);
    boolean removeReader(int id);
    void add(Reader reader);
    boolean updateReader(int id, Reader reader);


}
