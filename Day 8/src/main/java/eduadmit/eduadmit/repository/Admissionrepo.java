package eduadmit.eduadmit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eduadmit.eduadmit.model.Admission;

public interface Admissionrepo extends JpaRepository<Admission,Integer>{
}
