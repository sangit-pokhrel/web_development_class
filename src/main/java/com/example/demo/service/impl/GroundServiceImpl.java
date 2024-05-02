package com.example.demo.service.impl;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;
import com.example.demo.repository.GroundRepository;
import com.example.demo.service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroundServiceImpl implements GroundService {
    private final GroundRepository groundRepository;


    @Override
    public List<Ground> findAll() {
        return groundRepository.findAll();
    }

    @Override
    public void saveData(GroundPojo groundPojo) {

        Ground ground = new Ground();

        ground.setId(groundPojo.getId());

        ground.setName(groundPojo.getName());

        ground.setImage(groundPojo.getImage());



        groundRepository.save(ground);

    }
    @Override
    public void deleteById(Integer id) {
        groundRepository.deleteById(id);
    }

    @Override
    public Ground findById(Integer id) {
        return null;
    }

}
