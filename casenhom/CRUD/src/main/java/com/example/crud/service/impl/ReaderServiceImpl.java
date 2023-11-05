package com.example.crud.service.impl;

import com.example.crud.model.Reader;
import com.example.crud.repo.IReaderRepo;
import com.example.crud.repo.impl.ReaderRepoImpl;
import com.example.crud.service.IReaderService;

import java.util.List;

public class ReaderServiceImpl implements IReaderService {
    private final IReaderRepo iReaderRepo = new ReaderRepoImpl();

    @Override
    public List<Reader> listReadable() {
        return iReaderRepo.listReadable();
    }

    @Override
    public Reader findById(int idReader) {
        return iReaderRepo.findById(idReader);
    }

    @Override
    public boolean removeReader(int id) {
        return iReaderRepo.removeReader(id);
    }

    @Override
    public void add(Reader reader) {
        iReaderRepo.add(reader);
    }

    @Override
    public boolean updateReader(int id, Reader reader) {
        return iReaderRepo.updateReader(id, reader);
    }
}
