package com.example.crud.service;

import com.example.crud.model.Reader;

import java.util.List;

public interface IReaderService {
    List<Reader> listReadable();

    Reader findById(int idReader);

    boolean removeReader(int id);

    void add(Reader reader);

    boolean updateReader(int id, Reader reader);

}
