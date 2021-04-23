package com.ccanozerr.fr.adapter;
import java.util.Optional;

import javax.persistence.LockModeType;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccanozerr.fr.domain.Footballer;
import com.ccanozerr.fr.domain.Licence;
import com.ccanozerr.fr.entity.FootballerEntity;
import com.ccanozerr.fr.repository.FootballerEntityRepository;
import com.ccanozerr.fr.repository.FootballerRepository;

@Repository
@ConditionalOnProperty(name="database.type", havingValue = "mysql")
public class FootballerRepositoryJpaAdapter implements FootballerRepository {
	
	@Autowired
	private FootballerEntityRepository footballerEntityRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	@Lock(LockModeType.PESSIMISTIC_READ)
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.MANDATORY)
	public Footballer create(Footballer footballer) {
		var footballerEntity = modelMapper.map(footballer, FootballerEntity.class);
		var savedEntity = footballerEntityRepository.save(footballerEntity);
		return modelMapper.map(savedEntity, Footballer.class);
	}

	@Override
	public Optional<Footballer> findByLicence(Licence licence) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Footballer delete(Footballer footballer) {
		// TODO Auto-generated method stub
		return null;
	}

}
