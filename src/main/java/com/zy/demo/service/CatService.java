package com.zy.demo.service;

import com.zy.demo.bean.Cat;
import com.zy.demo.dao.CatDao;
import com.zy.demo.repository.Cat2Repository;
import com.zy.demo.repository.CatRepository;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/2/18.
 */
@Service
public class CatService {
    @Resource
    private CatRepository catRepository;
    @Resource
    private Cat2Repository cat2Repository;

    @Resource
    private CatDao catDao;
    //保存数据.
    @Transactional
    public void save(Cat cat) {
        catRepository.save(cat);
    }

    //删除数据》
    @Transactional
    public void delete(int id) {
        catRepository.delete(id);
    }

    //查询数据.
    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);
    }


    public Cat findByCatName2(String catName){
        return cat2Repository.findMyCatName(catName);
    }


    public Cat selectByCatName(String catName){
        return catDao.selectByCatName(catName);
    }
}
