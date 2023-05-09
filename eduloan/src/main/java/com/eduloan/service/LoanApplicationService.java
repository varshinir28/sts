package com.eduloan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduloan.model.LoanApplicationModel;
import com.eduloan.repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {
       @Autowired
		LoanApplicationRepository laRep;
		public List<LoanApplicationModel> get()
		{
			List<LoanApplicationModel> l=laRep.findAll();
			return l;
		}
		public LoanApplicationModel saveUser( LoanApplicationModel l)
		{
			return laRep.save(l);
		}
		public void Del(int id)
		{
			laRep.deleteById(id);
		}
		public LoanApplicationModel updateUser( LoanApplicationModel l)
		{
			return laRep.save(l);
		}

	}
	
	

