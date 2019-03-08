package cinema.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "seat", schema = "md-cinema", catalog = "")
public class SeatEntity {
    private int seatId;
    private int seatType;
    private int seatRow;
    private int seatCol;
    private int roomRoomId;

    @Id
    @Column(name = "seat_id")
    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    @Basic
    @Column(name = "seat_type")
    public int getSeatType() {
        return seatType;
    }

    public void setSeatType(int seatType) {
        this.seatType = seatType;
    }

    @Basic
    @Column(name = "seat_row")
    public int getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    @Basic
    @Column(name = "seat_col")
    public int getSeatCol() {
        return seatCol;
    }

    public void setSeatCol(int seatCol) {
        this.seatCol = seatCol;
    }

    @Basic
    @Column(name = "room_room_id")
    public int getRoomRoomId() {
        return roomRoomId;
    }

    public void setRoomRoomId(int roomRoomId) {
        this.roomRoomId = roomRoomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeatEntity that = (SeatEntity) o;
        return seatId == that.seatId &&
                seatType == that.seatType &&
                seatRow == that.seatRow &&
                seatCol == that.seatCol &&
                roomRoomId == that.roomRoomId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatId, seatType, seatRow, seatCol, roomRoomId);
    }
}
