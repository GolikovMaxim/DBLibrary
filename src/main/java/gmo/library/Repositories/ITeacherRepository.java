package gmo.library.Repositories;

import gmo.library.Entities.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Long> {
    @Query("" +
            "select distinct r from Reader r " +
            "join Teacher t on t.id = r.id where " +
            "(:lastName = '' or :lastName = r.lastName) and " +
            "(:firstName = '' or :firstName = r.firstName) and " +
            "(:secondName = '' or :secondName = r.secondName) and " +
            "(:poiid = 0 or :poiid = t.pointOfIssue.id) and " +
            "(:department = 0 or :department = t.department.id) and " +
            "(:faculty = 0 or t.department.faculty.id = :faculty)")
    Page<Teacher> findByParams(@Param("lastName") String lastName, @Param("firstName") String firstName,
                               @Param("secondName") String secondName, @Param("department") Integer group,
                               @Param("poiid") Integer poiid, @Param("faculty") Integer faculty, Pageable pageable);
}
