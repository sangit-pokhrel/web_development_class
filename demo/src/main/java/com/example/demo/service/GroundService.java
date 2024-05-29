package com.example.demo.service;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;

import java.util.List;

public interface GroundService {
    List<Ground> findAll();

    void saveData(GroundPojo groundPojo);

    void deleteById(Integer id);


    Ground findById(Integer id);


}
