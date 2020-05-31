package gmo.library.Controllers;

import gmo.library.DTOs.DepartmentDTO;
import gmo.library.Entities.Department;
import gmo.library.Mappers.AbstractMapper;
import gmo.library.Mappers.IMapper;
import gmo.library.Repositories.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final IDepartmentRepository departmentRepository;

    @Autowired
    public DepartmentController(IDepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @GetMapping
    public ResponseEntity<Page<DepartmentDTO>> getDepartments(Pageable pageable) {
        IMapper<Department, DepartmentDTO, Long> departmentMapper = AbstractMapper.mappers.get(Department.class);
        return ResponseEntity.ok(departmentRepository.findAll(pageable).map(departmentMapper::toDTO));
    }
}
