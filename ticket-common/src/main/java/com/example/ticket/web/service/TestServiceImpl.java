package com.example.ticket.web.service;

import com.example.ticket.web.model.Test;
import com.example.ticket.web.model.TestExample;
import com.example.ticket.web.persistence.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestMapper testMapper;

    @Override
    public int save(Test test) {
        return testMapper.insert(test);
    }

    @Override
    public List<Test> selectAll() {
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo(1L);
        List<Test> list = testMapper.selectByExample(testExample);
        return  list;
    }
}
