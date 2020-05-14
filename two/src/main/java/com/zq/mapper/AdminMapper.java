package com.zq.mapper;

import com.zq.bean.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {

    public List<Admin> selectAdmin();
}
