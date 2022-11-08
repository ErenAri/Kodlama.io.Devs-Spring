package kodlamaIoDevs.kodlamaIoDevs.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdateLanguageRequest {
	private int id;
	private String name;
}
