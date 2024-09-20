package com.example.controller;

import com.example.pojo.Result;
import com.example.service.EmpService;
import com.example.service.impl.EmpService1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Slf4j
@RestController
public class test1controller {
    //@Autowired
    // private EmpService es;
    // 依赖注入
    //private EmpService es=new EmpService1();
    @Autowired
    private EmpService1 es;

    @GetMapping("/list")
    //page页码
    // pagesize每页展示
    public Result list(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pagesize
            , String name, Integer age) {
        //获取数据es.empS()
        //响应
        System.out.println("11111111测试2");
        return Result.success(es.page(page, pagesize, name, age));
    }

    /*@PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws Exception {
        log.info("文件上传:{},{},{}", username, age, image);
        //获取原始文件名-1.jPg123.0.0.jpg
        String originalFilename = image.getOriginalFilename();
    //构造唯一的文件名(不能重复)- uuid(通用唯一识别码)de49685b-61c0-4b11-80fa-c71e95924018
        int index = originalFilename.lastIndexOf(".");
        String extname = originalFilename.substring(index);
        String newFileName = UUID.randomUUID().toString()+ extname;
        log.info("新的文件名:{}",newFileName);
        //将文件存储在服务器的磁盘目录中 E:\images
        image.transferTo(new File("D:\\images\\" + newFileName));
        return Result.success();

    }*/
}
