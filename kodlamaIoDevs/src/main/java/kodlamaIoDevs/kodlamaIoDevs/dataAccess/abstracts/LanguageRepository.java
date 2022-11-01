package kodlamaIoDevs.kodlamaIoDevs.dataAccess.abstracts;

import java.util.List;

import kodlamaIoDevs.kodlamaIoDevs.entities.concretes.Language;

public interface LanguageRepository {

	List<Language> getAll();
	void add(Language language);
	void delete(Language language);
	
	public void update(int id, String name);
	public Language getById(int id);
	
}
