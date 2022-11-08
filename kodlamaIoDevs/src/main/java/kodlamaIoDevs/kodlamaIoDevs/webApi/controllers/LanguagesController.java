package kodlamaIoDevs.kodlamaIoDevs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIoDevs.kodlamaIoDevs.business.abstracts.LanguageService;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.CreateLanguageRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.DeleteLanguageRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.requests.UpdateLanguageRequest;
import kodlamaIoDevs.kodlamaIoDevs.business.responses.GetAllLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService =languageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getAll(){
		return this.languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createRequest)throws Exception {
		this.languageService.add(createRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteLanguageRequest deleteRequest) {
		this.languageService.delete(deleteRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateLanguageRequest updateRequest)throws Exception {
		this.languageService.update(updateRequest);
	}
	
	@GetMapping("/getById")
	public GetAllLanguageResponse getAll(int id) {
		return this.languageService.getById(id);
	}
	
	
	
	
}
