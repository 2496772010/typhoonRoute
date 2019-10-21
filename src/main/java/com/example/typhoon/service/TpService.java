package com.example.typhoon.service;

import com.example.typhoon.bean.TpEntity;
import com.example.typhoon.mapper.TpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@ComponentScan({"com.example.typhoon.mapper"})
@Service("tpService")
public class TpService {
    @Autowired
    private TpMapper tpMapper;
    public TpEntity select(String name){
        return tpMapper.select(name);
    }
    public List<TpEntity> selectTp(String name){
        return tpMapper.selectTp(name);
    }

}
