package com.example.ticket.web.service;

import com.example.ticket.web.model.Test;

import java.util.List;

public interface TestService {

    int save(Test test);
    List<Test> selectAll();

}
