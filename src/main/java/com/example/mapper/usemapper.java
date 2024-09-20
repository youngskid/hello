package com.example.mapper;

import com.example.pojo.use;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Mapper
public interface usemapper {
    //1注解
    //@Select("select * from test1")
    //public List<use> l();
    //2xml+ mybatisX快速定位
    //public List<use> l();
    //动态
    public List<use> l(String name,Integer age);

}
