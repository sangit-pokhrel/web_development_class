package com.example.springboot_1.controller;


import com.example.springboot_1.entity.Ground;
import com.example.springboot_1.pojo.FutsalPojo;
import com.example.springboot_1.repository.FutsalRepository;
import com.example.springboot_1.service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ground")
@RequiredArgsConstructor




public class GroundController {


    private final GroundService groundService;
    private final FutsalRepository futsalRepository;


    @PostMapping("/save")

    public void save(@RequestBody FutsalPojo futsalPojo){

        this.groundService.saveData(futsalPojo);

    }


    @GetMapping("/list")
    public List<Ground> list(){
        return futsalRepository.findAll();
    }


}
