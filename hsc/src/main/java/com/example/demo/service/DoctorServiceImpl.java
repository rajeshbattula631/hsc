package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DoctorDAO;
import com.example.demo.dto.Doctor;
@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorDAO doctorDAO;
	
	@Override
	public List<Doctor> getDoctorsList() {
		// TODO Auto-generated method stub
		return (List<Doctor>) doctorDAO.findAll();
	}

}
