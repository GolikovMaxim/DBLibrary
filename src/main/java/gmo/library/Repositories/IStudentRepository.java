package gmo.library.Repositories;

import gmo.library.Entities.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface IStudentRepository extends JpaRepository<Student, Long> {
    @Query("" +
            "select distinct r from Reader r " +
            "join Student s on s.id = r.id where " +
            "(:fullName = '' or concat(r.firstName, r.secondName, r.lastName) like :fullName) " +
            "and (:group = 0 or s.group.id = :group)")
    Page<Student> findByParams(@Param("fullName") String fullName, @Param("group") Integer group, Pageable pageable);
}
