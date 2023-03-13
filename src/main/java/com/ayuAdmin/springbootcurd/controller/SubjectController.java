package com.ayuAdmin.springbootcurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ayuAdmin.springbootcurd.bean.Subject;
import com.ayuAdmin.springbootcurd.service.SubjectService;

@RestController

public class SubjectController {
     
	@Autowired
	 private SubjectService subjectService;
	
	@RequestMapping("/subjects") //to map the url
	public List<Subject> getAllSubjects(){  //call service class from hgere
		return  subjectService.getAllSubjects();
	}
	
	
	//method to add a subject to databse
	@RequestMapping(method = RequestMethod.POST , value="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}
	
	//update any subject
	@RequestMapping(method = RequestMethod.PUT , value="/subjects/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody Subject subject) {   //@PathVariable will capture the id from request body/url
		subjectService.updateSubject(id, subject);
	}
	
	//delete
	@RequestMapping(method = RequestMethod.DELETE , value="/subjects/{id}")
	public void deleteSubject(@PathVariable String id) {   //@PathVariable will capture the id from request body/url
		subjectService.deleteSubject(id);
	}
	
}
