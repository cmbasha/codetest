package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Doctor;
import com.example.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

	  @Autowired
	  private DoctorService doctorService;
	  
	  @PostMapping("/add-doctor")
	  public Doctor addDoctor(@RequestBody Doctor doctor)
	  {
	    return doctorService.addDoctor(doctor);
	  }
}
