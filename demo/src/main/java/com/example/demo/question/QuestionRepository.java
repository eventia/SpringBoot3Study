package com.example.demo.question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	
	// QuestionRepository
	Question findBySubject(String subject);
	
	// findBySubjectAndContent
	Question findBySubjectAndContent(String subject, String content);
	

}
