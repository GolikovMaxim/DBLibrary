package gmo.library.Controllers;

import gmo.library.DTOs.GradeDTO;
import gmo.library.Entities.Grade;
import gmo.library.Mappers.AbstractMapper;
import gmo.library.Mappers.IMapper;
import gmo.library.Repositories.IGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grades")
public class GradeController {
    private final IGradeRepository gradeRepository;

    @Autowired
    public GradeController(IGradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    @GetMapping
    public ResponseEntity<Page<GradeDTO>> getGrades(Pageable pageable) {
        IMapper<Grade, GradeDTO, Long> gradeMapper = AbstractMapper.mappers.get(Grade.class);
        return ResponseEntity.ok(gradeRepository.findAll(pageable).map(gradeMapper::toDTO));
    }
}
