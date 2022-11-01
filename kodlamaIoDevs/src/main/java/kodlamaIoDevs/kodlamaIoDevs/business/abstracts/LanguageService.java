package kodlamaIoDevs.kodlamaIoDevs.business.abstracts;

import java.util.List;

import kodlamaIoDevs.kodlamaIoDevs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	void add(Language language);
	void delete(Language language);
	public void update(int id, String name);

}
