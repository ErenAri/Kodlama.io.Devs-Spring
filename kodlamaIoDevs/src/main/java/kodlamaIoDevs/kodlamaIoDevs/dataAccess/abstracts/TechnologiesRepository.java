package kodlamaIoDevs.kodlamaIoDevs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaIoDevs.kodlamaIoDevs.entities.concretes.Technologies;

public interface TechnologiesRepository extends JpaRepository<Technologies, Integer>{

}
