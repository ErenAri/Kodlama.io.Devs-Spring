package kodlamaIoDevs.kodlamaIoDevs.entities.concretes;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="languages")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {
	int id;
	String name;
}
