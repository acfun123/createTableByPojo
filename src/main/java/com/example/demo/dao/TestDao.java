package com.example.demo.dao;

import com.example.demo.entity.Test;
import com.gitee.sunchenbin.mybatis.actable.manager.common.BaseMysqlCRUDManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

    @Autowired
    private BaseMysqlCRUDManager baseMysqlCRUDManager;

    public void delete(Test test){
        baseMysqlCRUDManager.delete(test);
    }

    public void insert(Test test){
        baseMysqlCRUDManager.save(test);
    }
}

