package kodlamaIoDevs.kodlamaIoDevs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaIoDevs.kodlamaIoDevs.business.abstracts.LanguageService;
import kodlamaIoDevs.kodlamaIoDevs.business.abstracts.TechnologiesService;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.technologies.CreateTechnologyRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.technologies.DeleteTechnologyRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.technologies.UpdateTechnologyRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.responses.GetAllLanguageResponse;
import kodlamaIoDevs.kodlamaIoDevs.business.responses.technologies.GetTechnologiesResponse;
import kodlamaIoDevs.kodlamaIoDevs.dataAccess.abstracts.TechnologiesRepository;
import kodlamaIoDevs.kodlamaIoDevs.entities.concretes.Language;
import kodlamaIoDevs.kodlamaIoDevs.entities.concretes.Technologies;

public class TechnologiesManager implements TechnologiesService{

	private TechnologiesRepository repository;
	private LanguageService service;
	
	@Autowired
	public TechnologiesManager(TechnologiesRepository repository, LanguageService service) {
		super();
		this.repository = repository;
		this.service = service;
	}

	@Override
	public List<GetTechnologiesResponse> getAll() {
		List<Technologies> technologies = this.repository.findAll();
		List<GetTechnologiesResponse> responses = new ArrayList<GetTechnologiesResponse>();
		
		for (Technologies technology : technologies) {
			GetTechnologiesResponse response = new GetTechnologiesResponse();
			response.setId(technology.getId());
			response.setName(technology.getName());
			response.setLanguageId(technology.getLanguage().getId());
			responses.add(response);
			
		}
		return responses;
	}

	@Override
	public GetTechnologiesResponse getById(int id) {
		Technologies technologies = this.repository.findById(id).get();
		GetTechnologiesResponse response = new GetTechnologiesResponse(technologies.getId(), technologies.getName(), technologies.getLanguage().getId());
		return response;
	}

	@Override
	public void add(CreateTechnologyRequest request) throws Exception{
		
		GetAllLanguageResponse response = this.service.getById(request.getLanguageId());
		Language language = new Language();
		language.setId(response.getId());
		language.setName(response.getName());
		Technologies technology = new Technologies();
		technology.setName(request.getName());
		technology.setLanguage(language);
		this.repository.save(technology);
		
	}

	@Override
	public void delete(DeleteTechnologyRequest request) {
		this.repository.deleteById(request.getId());
		
	}

	@Override
	public void update(UpdateTechnologyRequest request) throws Exception{
		GetAllLanguageResponse response = this.service.getById(request.getLanguagageId());
		Language language = new Language();
		language.setId(response.getId());
		language.setName(response.getName());
		Technologies technology = new Technologies();
		technology.setId(request.getId());
		technology.setName(request.getName());
		technology.setLanguage(language);
		this.repository.save(technology);
	}

}
