package gmo.library.Repositories;

import gmo.library.DTOs.DepartmentDTO;
import gmo.library.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = DepartmentDTO.DepartmentProjection.class)
public interface IDepartmentRepository extends JpaRepository<Department, Long> {
}
