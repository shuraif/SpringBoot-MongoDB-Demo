package com.ms.mongodb.controller;

import com.ms.mongodb.model.GroceryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.mongodb.service.MongoService;

@RestController
public class DemoController {

	@Autowired
	MongoService mongoService;

	@GetMapping("/insertobjects")
	public ResponseEntity<?> createObjects(@RequestBody GroceryItem item) {

		return mongoService.insertData(item);

	}

	@GetMapping("/readobjects")
	public ResponseEntity<?> showAllGroceryItems() {

		return mongoService.readData();

	}
	
	@GetMapping("/count")
	public ResponseEntity<?> getItemCount() {

		return mongoService.getCounts();

	}

}
