package kodlamaIoDevs.kodlamaIoDevs.business.abstracts;

import java.util.List;

import kodlamaIoDevs.kodlamaIoDevs.business.requests.CreateLanguageRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.DeleteLanguageRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.UpdateLanguageRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.responses.GetAllLanguageResponse;

public interface LanguageService {
	List<GetAllLanguageResponse> getAll();
	GetAllLanguageResponse getById(int id);
	void add(CreateLanguageRequest createRequest) throws Exception;
	void delete(DeleteLanguageRequest deleteRequest);
	public void update(UpdateLanguageRequest updateRequest) throws Exception;
	

}
