package com.example.typhoon.mapper;

import com.example.typhoon.bean.TpEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TpMapper {
    public void insert(TpEntity tpEntity);
    public TpEntity select(String name);
    public List<TpEntity> selectTp(String name);
    public void delete(Integer id);
    public void update(Integer id);
}
