package com.mockserver.demo.dao;

import com.mockserver.demo.entity.Mock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MockMapper {

    Mock selectById(int id);
    int insertMock(Mock mock);

}
