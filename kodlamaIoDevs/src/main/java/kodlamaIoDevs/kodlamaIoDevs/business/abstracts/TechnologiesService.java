package kodlamaIoDevs.kodlamaIoDevs.business.abstracts;

import java.util.List;

import kodlamaIoDevs.kodlamaIoDevs.business.requests.technologies.CreateTechnologyRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.technologies.DeleteTechnologyRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.technologies.UpdateTechnologyRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.responses.technologies.GetTechnologiesResponse;

public interface TechnologiesService {
	List<GetTechnologiesResponse> getAll();
	GetTechnologiesResponse getById(int id);
	void add(CreateTechnologyRequest request) throws Exception;
	void delete(DeleteTechnologyRequest request);
	void update(UpdateTechnologyRequest request) throws Exception; 
}
