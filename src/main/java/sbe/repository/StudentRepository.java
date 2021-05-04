package sbe.repository;

import sbe.model.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByNameIgnoreCaseContaining(String name);

    Object findAll(Pageable pageable);
}
