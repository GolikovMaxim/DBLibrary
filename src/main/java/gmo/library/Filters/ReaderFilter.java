package gmo.library.Filters;

import gmo.library.Entities.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class ReaderFilter {
    private String firstName;
    private String secondName;
    private String lastName;
    private LocalDate birthday;
    private StudyGroup group;
    private Degree degree;
    private Department department;
    private Faculty faculty;
    private Grade grade;
}
