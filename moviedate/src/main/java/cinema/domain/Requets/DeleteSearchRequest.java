package cinema.domain.Requets;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteSearchRequest {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DeleteSearchRequest{" +
                "id=" + id +
                '}';
    }
}
