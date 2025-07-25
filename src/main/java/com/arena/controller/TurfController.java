package com.arena.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arena.service.TurfService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/turfs")
@AllArgsConstructor
@Validated
public class TurfController {

	private TurfService turfService;
	
	//GET ALL TURFS
	@GetMapping
	public ResponseEntity<?> getAllTurfs() {
	    return ResponseEntity.ok(turfService.getAllTurfs());
	}
}
