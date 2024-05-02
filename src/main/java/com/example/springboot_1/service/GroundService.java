package com.example.springboot_1.service;


import com.example.springboot_1.entity.Ground;
import com.example.springboot_1.pojo.FutsalPojo;
import com.example.springboot_1.repository.FutsalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface GroundService {



    void saveData(FutsalPojo futsalPojo);

    List<Futsal> findAll();


}



@Service
@RequiredArgsConstructor

class GroundServiceImpl implements GroundService {



    private final FutsalRepository futsalRepository;





    @Override
    public void saveData(FutsalPojo futsalPojo) {

        Ground ground = new Ground();

        ground.setId(futsalPojo.getId());

        ground.setName(futsalPojo.getName());



        futsalRepository.save(ground);

    }

    @Override
    public List<Futsal> findAll() {
        return List.of();
    }


}
