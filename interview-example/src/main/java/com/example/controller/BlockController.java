package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Block;
import com.example.service.BlockService;

@RestController
public class BlockController {

	@Autowired
	private BlockService blockService;
	
	@PostMapping("/add-block")
	public Block addBlock(@RequestBody Block block)
	{
	   return blockService.addBlock(block);
	}
	
	@GetMapping("/getBlock/{blockNo}")
	public Optional<Block> getBlockDetails(@PathVariable("blockNo") int blockNo)
	{
	   return blockService.getBlock(blockNo);
	}
}
