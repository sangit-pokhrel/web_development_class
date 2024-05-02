package com.example.demo.controller;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;
import com.example.demo.service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ground")
@RequiredArgsConstructor

public class GroundController<groundPojo> {
    private final GroundService groundService;
//    private GroundPojo groundPojo;

    @GetMapping("/get")
    public List<Ground> finaAll(){
        return this.groundService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody GroundPojo groundPojo){
        this.groundService.saveData(groundPojo);
    }

    @PostMapping("/update")
    public void groundUpdate(@RequestBody GroundPojo groundPojo) {
        groundService.saveData(groundPojo);
    }



    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        this.groundService.deleteById(id);
    }
    //get by id portion
    @GetMapping("/get/{id}")
    public Ground getById(@PathVariable Integer id){
        return this.groundService.findById(id);
    }



}
