package cinema.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "director", schema = "md-cinema", catalog = "")
public class DirectorEntity {
    private int derectorId;
    private String derectorName;
    private Integer derectorSex;

    @Id
    @Column(name = "derector_id")
    public int getDerectorId() {
        return derectorId;
    }

    public void setDerectorId(int derectorId) {
        this.derectorId = derectorId;
    }

    @Basic
    @Column(name = "derector_name")
    public String getDerectorName() {
        return derectorName;
    }

    public void setDerectorName(String derectorName) {
        this.derectorName = derectorName;
    }

    @Basic
    @Column(name = "derector_sex")
    public Integer getDerectorSex() {
        return derectorSex;
    }

    public void setDerectorSex(Integer derectorSex) {
        this.derectorSex = derectorSex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectorEntity that = (DirectorEntity) o;
        return derectorId == that.derectorId &&
                Objects.equals(derectorName, that.derectorName) &&
                Objects.equals(derectorSex, that.derectorSex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(derectorId, derectorName, derectorSex);
    }
}
