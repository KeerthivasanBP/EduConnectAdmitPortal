package eduadmit.eduadmit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eduadmit.eduadmit.model.Admission;

public interface StudentDetailrepo extends JpaRepository<Admission,Integer>{

    
}