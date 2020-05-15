package gmo.library.DTOs;

import gmo.library.Entities.Reader;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public abstract class ReaderDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Reader.class);
    }

    private String firstName;
    private String secondName;
    private String lastName;
    private Date birthday;
}
