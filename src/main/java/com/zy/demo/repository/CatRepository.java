package com.zy.demo.repository;

import com.zy.demo.bean.Cat;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2017/2/18.
 */
public interface CatRepository extends CrudRepository<Cat, Integer> {
}
