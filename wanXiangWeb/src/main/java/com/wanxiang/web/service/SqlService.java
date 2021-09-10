package com.wanxiang.web.service;


import com.wanxiang.web.mapper.SalaryMapper;
import com.wanxiang.web.mapper.ext.ExtSalaryMapper;
import com.wanxiang.web.pojo.Salary;
import com.wanxiang.web.pojo.SalaryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SqlService {

    @Resource
    SalaryMapper salaryMapper;
    ExtSalaryMapper extSalaryMapper;

    public List<Salary> getSalaryInfo(SalaryExample example){
        return salaryMapper.selectByExample(example);
    }


    public int insert(Salary record){
        return salaryMapper.insert(record);
    }


    public int delete(SalaryExample example){
        return salaryMapper.deleteByExample(example);
    }

    public int update(@Param("salary") Salary salary, @Param("example") SalaryExample example){
        return salaryMapper.updateByExample(salary, example);
    }


}
