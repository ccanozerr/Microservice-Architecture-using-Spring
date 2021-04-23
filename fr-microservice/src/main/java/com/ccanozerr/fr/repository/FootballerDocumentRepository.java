package com.ccanozerr.fr.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ccanozerr.fr.document.FootballerDocument;

public interface FootballerDocumentRepository extends MongoRepository<FootballerDocument, String>{
	
	List<FootballerDocument> findAllByLeague();
	
	List<FootballerDocument> findAllByTeam();
	
	FootballerDocument findByLicence();

}
