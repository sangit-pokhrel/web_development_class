package com.example.springboot_1.repository;

import com.example.springboot_1.entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FutsalRepository extends JpaRepository<Ground,Integer> {


}
