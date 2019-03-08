package cinema.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "md-cinema", catalog = "")
public class UserEntity {
    private int userId;
    private int active;
    private String userEmail;
    private String userName;
    private String userPass;
    private String userFullname;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "active")
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_pass")
    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Basic
    @Column(name = "user_fullname")
    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return userId == that.userId &&
                active == that.active &&
                Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userPass, that.userPass) &&
                Objects.equals(userFullname, that.userFullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, active, userEmail, userName, userPass, userFullname);
    }
}
