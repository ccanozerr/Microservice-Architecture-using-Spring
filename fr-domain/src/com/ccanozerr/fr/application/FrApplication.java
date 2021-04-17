package com.ccanozerr.fr.application;

import java.util.Optional;

import com.ccanozerr.fr.domain.Footballer;
import com.ccanozerr.fr.domain.Licence;

public interface FrApplication {
	
	Footballer createFootballer(Footballer footballer);
	
	Optional<Footballer> deleteFootballer(Licence licence);
	
	Optional<Footballer> getFootballerInfo(Licence licence);

}
