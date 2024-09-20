package com.example.service.impl;

import com.example.mapper.usemapper;
import com.example.pojo.PageBean;
import com.example.pojo.use;
import com.example.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpService1 implements EmpService {
    //@Autowired
    //private EmpDao e
    @Autowired
    private usemapper u;

   // public List<use> empS() {
        //e.emp()
        //return new ArrayList<>();
        //返回处理完毕的数据
        //return u.l();
    //}

    //分页查询
    public PageBean page(Integer page, Integer pagesize,String name,Integer age) {//设置分页参数
        PageHelper.startPage(page, pagesize);
        // 执行查询
        List<use> empList = u.l(name,age);
        Page<use> p = (Page<use>) empList;
        //3.封装
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;
    }
}
