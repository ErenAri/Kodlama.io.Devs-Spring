package kodlamaIoDevs.kodlamaIoDevs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaIoDevs.kodlamaIoDevs.business.abstracts.LanguageService;
import kodlamaIoDevs.kodlamaIoDevs.dataAccess.abstracts.LanguageRepository;
import kodlamaIoDevs.kodlamaIoDevs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(Language language) {
		this.languageRepository = languageRepository;
	}
	
	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) {
		if(language.getName().isEmpty()||language.getName().isBlank()) {
			return;
		}
		languageRepository.add(language);
	}

	@Override
	public void delete(Language language) {
		if(languageRepository.getAll().contains(language)) {
			languageRepository.delete(language);
		}
		
	}

	@Override
	public void update(int id, String name) {
		if(name.isEmpty()||name.isBlank()) {
			return;
		}
		languageRepository.update(id, name);
		
	}

}
