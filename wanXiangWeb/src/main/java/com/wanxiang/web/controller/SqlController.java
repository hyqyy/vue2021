package com.wanxiang.web.controller;


import com.wanxiang.web.pojo.Salary;
import com.wanxiang.web.pojo.SalaryExample;
import com.wanxiang.web.service.SqlService;
import org.springframework.web.bind.annotation.*;



import javax.annotation.Resource;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping(value = "/sql")
public class SqlController {


    @Resource
    SqlService sqlService;


    //增
    @RequestMapping(value = "/employee/add", method = {RequestMethod.POST})
    public int addEmployee(@RequestBody Salary salary) {
        if(salary.getId()==null){
            return sqlService.insert(salary);
        } else {
            SalaryExample example = new SalaryExample();
            SalaryExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(salary.getId());
            return sqlService.update(salary,example);
        }

    }


    //删
    @RequestMapping(value = "/employee/delete", method = {RequestMethod.POST})
    public int deleteEmployee(@RequestBody Salary salary) {
        Integer id = salary.getId();
        SalaryExample example = new SalaryExample();
        SalaryExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        return sqlService.delete(example);

    }

    //改
    @RequestMapping(value = "/employee/update", method = {RequestMethod.POST})
    public void updateEmployee() {

    }

    //查
    @RequestMapping(value = "/employee/all", method = {RequestMethod.GET})
    public List<Salary> selectEmployee() {
        SalaryExample example = new SalaryExample();
        return sqlService.getSalaryInfo(example);
    }

    //查
    @RequestMapping(value = "/employee/{id}", method = {RequestMethod.GET})
    public List<Salary> selectEmployee(@PathVariable int id) {
        SalaryExample example = new SalaryExample();
        SalaryExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        return sqlService.getSalaryInfo(example);
    }


}
