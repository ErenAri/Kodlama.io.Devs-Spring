package kodlamaIoDevs.kodlamaIoDevs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaIoDevs.kodlamaIoDevs.business.abstracts.LanguageService;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.CreateLanguageRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.DeleteLanguageRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.UpdateLanguageRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.responses.GetAllLanguageResponse;
import kodlamaIoDevs.kodlamaIoDevs.dataAccess.abstracts.LanguageRepository;
import kodlamaIoDevs.kodlamaIoDevs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	@Override
	public List<GetAllLanguageResponse> getAll() {
		List<Language> languages = this.languageRepository.findAll();
		List<GetAllLanguageResponse> responses = new ArrayList<GetAllLanguageResponse>();
		
		for(Language language : languages) {
			GetAllLanguageResponse getAllLanguageResponse = new GetAllLanguageResponse();
			getAllLanguageResponse.setId(language.getId());
			getAllLanguageResponse.setName(language.getName());
			
			responses.add(getAllLanguageResponse);
		}
		
		return responses;
	}
	@Override
	public void add(CreateLanguageRequest createRequest) throws Exception{
		List<Language> list =this.languageRepository.findAll();
		
		if(createRequest.getName().isEmpty()) {
			throw new Exception("İsim boş bırakılamaz!!");
		}
		for(Language  language:list) {
			if(createRequest.getName().equals(language.getName())) {
				throw new Exception();
			}
		}
		Language language = new Language();
		language.setName(language.getName());
		this.languageRepository.save(language);
	}
	@Override
	public void delete(DeleteLanguageRequest deleteRequest) {
		this.languageRepository.deleteById(deleteRequest.getId());
		
	}
	@Override
	public void update(UpdateLanguageRequest updateRequest) throws Exception{
		List<Language> list = this.languageRepository.findAll();
		if(updateRequest.getName().isEmpty()) {
			throw new Exception("İsim boş olamaz!!!");
		}
		for(Language language:list) {
			if(updateRequest.getName().equals(language.getName())) {
				throw new Exception("İsim aynı olamaz!!!!");
			}
		}
		Language language = new Language();
		language.setId(language.getId());
		language.setName(language.getName());
		this.languageRepository.save(language);
	}

	@Override
	public GetAllLanguageResponse getById(int id) {
		Language language = this.languageRepository.findById(id).get();
		GetAllLanguageResponse response = new GetAllLanguageResponse();
		response.setId(language.getId());
		response.setName(language.getName());
		return response;
	}
	
	

}
