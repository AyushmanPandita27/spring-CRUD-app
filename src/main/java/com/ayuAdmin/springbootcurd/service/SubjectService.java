package com.ayuAdmin.springbootcurd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayuAdmin.springbootcurd.bean.Subject;
import com.ayuAdmin.springbootcurd.repository.SubjectRepository;

@Service
public class SubjectService {
     
	@Autowired
	public SubjectRepository subjectRepo;
	
public List<Subject> getAllSubjects(){
	//call the method froomm interfaxce we cant make obj of interface do make a reference var for that
	List<Subject> subjects =new ArrayList<>();
	subjectRepo.findAll().forEach(subjects::add);
	return subjects;

	
}

public void addSubject(Subject subject) {
	subjectRepo.save(subject); 
}

public void updateSubject(String id, Subject subject) {
	subjectRepo.save(subject); 
}

public void deleteSubject(String id) {
	subjectRepo.deleteById(id);
}





}
