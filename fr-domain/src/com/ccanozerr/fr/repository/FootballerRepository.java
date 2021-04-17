package com.ccanozerr.fr.repository;

import java.util.Optional;

import com.ccanozerr.fr.domain.Footballer;
import com.ccanozerr.fr.domain.Licence;

public interface FootballerRepository {
	
	Footballer create(Footballer footballer);
	
	Optional<Footballer> findByLicence(Licence licence);
	
	Footballer delete(Footballer footballer);

}
