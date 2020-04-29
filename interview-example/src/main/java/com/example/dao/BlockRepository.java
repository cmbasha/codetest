package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block, Integer>{

}
