package kodlamaIoDevs.kodlamaIoDevs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaIoDevs.kodlamaIoDevs.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer>{

	
}
