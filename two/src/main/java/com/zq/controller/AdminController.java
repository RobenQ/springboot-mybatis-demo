package com.zq.controller;

import com.zq.bean.Admin;
import com.zq.serviceImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping("/index")
    public String index(){
        return "Hello Springboot";
    }

    @RequestMapping("sel")
    public Map<String,Object> selectAllAdmin(){
        Map<String,Object> map = new HashMap<String, Object>();
        List<Admin> admins = adminService.selectAllAdmin();
        map.put("admin",admins);
        return map;
    }

}
