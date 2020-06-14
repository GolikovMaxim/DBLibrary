package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class Issue extends AbstractEntity<Long> {
    private String bookName;
    @Column(name = "BooksCount")
    private int bookCount;
    @ManyToOne
    @JoinColumn(name = "FileCabinetID")
    private FileCabinet fileCabinet;
    @Temporal(value = TemporalType.DATE)
    private Date receiptDate;
    @Formula("(BooksCount - (select count(*) FROM BookTake b where b.IssueID = id and b.ReturnDate is null))")
    private int booksInStock;
}
