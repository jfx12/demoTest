package com.xjf.Config;

import com.xjf.pojo.USer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
//这个也会spring容器托管，代表这是一个配置类，类似于beans.xml
@Configuration
@ComponentScan("com.xjf.dao")
@Import(xjfConfig2.class)
public class xjfConfig {
    //注册一个bean标签，就类似于之前的bean标签
    //这个方法的名字就相当于bean的id
    //返回值就相当于对应的class
    @Bean
    public USer getUser(){
    return  new USer();
    }
}
