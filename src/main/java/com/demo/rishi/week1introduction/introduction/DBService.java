package com.demo.rishi.week1introduction.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    private DB db;

    public DBService(DB db){
        this.db = db;
    }

    String getData(){
        return db.getData();
    }
}
