package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entity.ImageModel;

@Repository
public interface ImageRepository extends JpaRepository<ImageModel,Integer>{

}
