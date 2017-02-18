package com.zy.demo.service;

import com.zy.demo.bean.Cat;
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
}
