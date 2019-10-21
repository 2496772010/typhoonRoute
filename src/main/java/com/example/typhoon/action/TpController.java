package com.example.typhoon.action;

import com.example.typhoon.bean.TpEntity;
import com.example.typhoon.service.TpService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:8082","null"})
@RestController
//@ComponentScan({"com.example.typhoon.service"})
@MapperScan("com.example.typhoon.mapper")
@EnableAutoConfiguration
public class TpController {
    @Autowired
    private TpService tpService;
    @RequestMapping(value = "/select/{name}", method = RequestMethod.POST)
    public List<TpEntity> selectTp(@PathVariable String name)  {
        List<TpEntity> tpEntities = null;
        System.out.println(name);
        try{
            tpEntities= tpService.selectTp(name);
            for (TpEntity i: tpEntities){
                System.out.println(i.getTime());
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return tpEntities;
    }


}