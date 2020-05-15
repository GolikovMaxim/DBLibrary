package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class Issue extends AbstractEntity<Long> {
    private String bookName;
    private int bookCount;
    private FileCabinet fileCabinet;
    @Temporal(value = TemporalType.DATE)
    private Date receiptDate;
}
