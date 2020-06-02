package gmo.library.Controllers;

import gmo.library.DTOs.StudyGroupDTO;
import gmo.library.Entities.StudyGroup;
import gmo.library.Mappers.AbstractMapper;
import gmo.library.Mappers.IMapper;
import gmo.library.Repositories.IStudyGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studyGroups")
public class StudyGroupController {
    private final IStudyGroupRepository studyGroupRepository;

    @Autowired
    public StudyGroupController(IStudyGroupRepository studyGroupRepository) {
        this.studyGroupRepository = studyGroupRepository;
    }

    @GetMapping
    public ResponseEntity<Page<StudyGroupDTO>> getStudyGroups(Pageable pageable) {
        IMapper<StudyGroup, StudyGroupDTO, Long> studyGroupMapper = AbstractMapper.mappers.get(StudyGroup.class);
        return ResponseEntity.ok(studyGroupRepository.findAll(pageable).map(studyGroupMapper::toDTO));
    }

    @PostMapping
    public ResponseEntity<StudyGroupDTO> addStudyGroup(@RequestBody StudyGroupDTO studyGroupDTO) {
        IMapper<StudyGroup, StudyGroupDTO, Long> studyGroupMapper = AbstractMapper.mappers.get(StudyGroup.class);
        studyGroupRepository.save(studyGroupMapper.toEntity(studyGroupDTO));
        return ResponseEntity.ok(studyGroupDTO);
    }
}
