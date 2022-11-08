package kodlamaIoDevs.kodlamaIoDevs.business.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateTechnologyRequest {
	private String name;
	private int languageId;
}
