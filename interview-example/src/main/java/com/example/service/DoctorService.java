package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DoctorRepository;
import com.example.entities.Doctor;

@Service
public class DoctorService {
	
	@Autowired
	public DoctorRepository doctorRepository;

	public Doctor addDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

}
