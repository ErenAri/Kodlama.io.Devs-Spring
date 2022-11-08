package kodlamaIoDevs.kodlamaIoDevs.business.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdateTechnologyRequest {
	private int id;
	private String name;
	private int languagageId;
	
}
