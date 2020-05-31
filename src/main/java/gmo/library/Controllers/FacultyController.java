package gmo.library.Controllers;

import gmo.library.DTOs.FacultyDTO;
import gmo.library.Entities.Faculty;
import gmo.library.Mappers.AbstractMapper;
import gmo.library.Mappers.IMapper;
import gmo.library.Repositories.IFacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faculties")
public class FacultyController {
    private final IFacultyRepository facultyRepository;

    @Autowired
    public FacultyController(IFacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @GetMapping
    public ResponseEntity<Page<FacultyDTO>> getFaculties(Pageable pageable) {
        IMapper<Faculty, FacultyDTO, Long> facultyMapper = AbstractMapper.mappers.get(Faculty.class);
        return ResponseEntity.ok(facultyRepository.findAll(pageable).map(facultyMapper::toDTO));
    }
}
