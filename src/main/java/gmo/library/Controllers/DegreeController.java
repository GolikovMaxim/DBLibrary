package gmo.library.Controllers;

import gmo.library.DTOs.DegreeDTO;
import gmo.library.Entities.Degree;
import gmo.library.Mappers.AbstractMapper;
import gmo.library.Mappers.IMapper;
import gmo.library.Repositories.IDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/degrees")
public class DegreeController {
    private final IDegreeRepository degreeRepository;

    @Autowired
    public DegreeController(IDegreeRepository degreeRepository) {
        this.degreeRepository = degreeRepository;
    }

    @GetMapping
    public ResponseEntity<Page<DegreeDTO>> getDegrees(Pageable pageable) {
        IMapper<Degree, DegreeDTO, Long> degreeMapper = AbstractMapper.mappers.get(Degree.class);
        return ResponseEntity.ok(degreeRepository.findAll(pageable).map(degreeMapper::toDTO));
    }
}
