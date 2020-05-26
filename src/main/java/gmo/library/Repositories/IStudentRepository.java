package gmo.library.Repositories;

import gmo.library.Entities.Student;
import gmo.library.Entities.StudyGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface IStudentRepository extends JpaRepository<Student, Long> {
    //@Query("select r from reader left outer join student s where s.id = r.id and concat(r.firstName, r.secondName, r.lastName) = :fullName and s.group = :group")
    //Page<Student> findByGroup(StudyGroup group, Pageable pageable);
}
