package com.ccanozerr.fr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccanozerr.fr.entity.FootballerEntity;

public interface FootballerEntityRepository extends JpaRepository<FootballerEntity, String>{
	
	List<FootballerEntity> findAllByLeague();
	
	List<FootballerEntity> findAllByTeam();
	
	FootballerEntity findByLicence();

}
