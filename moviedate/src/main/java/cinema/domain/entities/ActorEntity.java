package cinema.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "actor", schema = "md-cinema", catalog = "")
public class ActorEntity {
    private int actorId;
    private String actorName;
    private Integer actorSex;

    @Id
    @Column(name = "actor_id")
    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    @Basic
    @Column(name = "actor_name")
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Basic
    @Column(name = "actor_sex")
    public Integer getActorSex() {
        return actorSex;
    }

    public void setActorSex(Integer actorSex) {
        this.actorSex = actorSex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorEntity that = (ActorEntity) o;
        return actorId == that.actorId &&
                Objects.equals(actorName, that.actorName) &&
                Objects.equals(actorSex, that.actorSex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, actorName, actorSex);
    }
}
