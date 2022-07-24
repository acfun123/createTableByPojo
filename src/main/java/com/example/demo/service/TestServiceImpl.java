package com.example.demo.service;

import com.example.demo.dao.TestDao;
import com.example.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public void insert(Test test) {
        testDao.insert(test);
    }

    @Override
    public void delete(Test test) {
        testDao.delete(test);
    }
}

