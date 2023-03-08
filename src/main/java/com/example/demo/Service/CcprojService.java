package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CcprojEntity;
import com.example.demo.Repository.Repo;
@Service
public class CcprojService {
	@Autowired //extends another class
    Repo stRepo; //reference variable
	
	public CcprojEntity saveDetails(CcprojEntity e) {
		return stRepo.save(e);
	}
	public List <CcprojEntity>getDetails()

{
		return stRepo.findAll();
		
}
	public CcprojEntity UpdateDetails(CcprojEntity e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}