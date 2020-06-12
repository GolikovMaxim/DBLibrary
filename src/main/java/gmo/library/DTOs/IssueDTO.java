package gmo.library.DTOs;

import gmo.library.Entities.Issue;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter @Getter
public class IssueDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Issue.class);
    }

    private String bookName;
    private int bookCount;
    private FileCabinetDTO fileCabinet;
    private Date receiptDate;

    public interface IssueProjection extends AbstractProjection<Long> {
        String getBookName();
        int getBookCount();
        FileCabinetDTO.FileCabinetProjection getFileCabinet();
        Date getReceiptDate();
    }
}
