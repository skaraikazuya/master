package com.mockserver.demo.service;

import com.mockserver.demo.dao.MockMapper;
import com.mockserver.demo.entity.Mock;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MockService {

    @Autowired
    private MockMapper mockMapper;

    public Mock findMockById(int id){
        return mockMapper.selectById(id);
    }

    public Map<String,Object> createMock(Mock mock){

        Map<String,Object> map = new HashMap<>();

        //空值处理
        if(mock==null){
            throw new IllegalArgumentException("参数不能为空！");
        }
        if(StringUtils.isBlank(mock.getMethod())){
            map.put("methodMsg","方法名不能为空！");
        }

        if(StringUtils.isBlank(mock.getPath())){
            map.put("pathMsg","路径不能为空！");
        }

        mockMapper.insertMock(mock);

        return map;

    }

}
