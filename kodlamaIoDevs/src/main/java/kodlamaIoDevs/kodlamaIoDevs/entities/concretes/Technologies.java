package kodlamaIoDevs.kodlamaIoDevs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Technologies")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Technologies {
	
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	@Column(name ="name")
	private String name;
	
	@ManyToOne()
	@JoinColumn(name="languageId")
	private Language language;
}
