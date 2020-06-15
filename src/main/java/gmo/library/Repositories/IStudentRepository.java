package gmo.library.Repositories;

import gmo.library.DTOs.StudentDTO;
import gmo.library.Entities.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;

@RepositoryRestResource(excerptProjection = StudentDTO.StudentProjection.class)
public interface IStudentRepository extends JpaRepository<Student, Long> {
    @Query("" +
            "select distinct r from Reader r " +
            "join Student s on s.id = r.id where " +
            "(:lastName = '' or r.lastName like concat('%', :lastName, '%')) and " +
            "(:firstName = '' or r.firstName like concat('%', :firstName, '%')) and " +
            "(:secondName = '' or r.secondName like concat('%', :secondName, '%')) and " +
            "(:poiid = 0 or :poiid = s.pointOfIssue.id) and " +
            "(:faculty = 0 or :faculty = s.group.faculty.id) and " +
            "(:group = 0 or s.group.id = :group)")
    Page<Student> findByParams(@Param("lastName") String lastName, @Param("firstName") String firstName,
                                  @Param("secondName") String secondName, @Param("group") Integer group,
                                  @Param("poiid") Integer poiid, @Param("faculty") Integer faculty, Pageable pageable);
}
