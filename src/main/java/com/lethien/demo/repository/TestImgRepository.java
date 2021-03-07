package com.lethien.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lethien.demo.entity.TestImg;

@Repository
public interface TestImgRepository extends JpaRepository<TestImg, Integer> {

}
