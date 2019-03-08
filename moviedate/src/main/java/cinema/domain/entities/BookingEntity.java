package cinema.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "booking", schema = "md-cinema", catalog = "")
public class BookingEntity {
    private int bookId;
    private int bookStatus;

    @Id
    @Column(name = "book_id")
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "book_status")
    public int getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(int bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingEntity that = (BookingEntity) o;
        return bookId == that.bookId &&
                bookStatus == that.bookStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookStatus);
    }
}
