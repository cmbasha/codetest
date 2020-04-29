package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BlockRepository;
import com.example.entities.Block;

@Service
public class BlockService {

	@Autowired
	private BlockRepository blockRepository;


	public Block addBlock(Block block) {
		return blockRepository.save(block);
	}

	public Optional<Block> getBlock(int blockNo) {
		return blockRepository.findById(blockNo);
	}
}
