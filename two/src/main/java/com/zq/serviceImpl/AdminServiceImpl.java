package com.zq.serviceImpl;

import com.zq.bean.Admin;
import com.zq.mapper.AdminMapper;
import com.zq.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public List<Admin> selectAllAdmin() {
        return adminMapper.selectAdmin();
    }
}
