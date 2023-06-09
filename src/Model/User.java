package Model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "user")
@NamedQueries({
        @NamedQuery(name = "User.countByEmail", query = "select count(u) from User u where u.email = :email"),
        @NamedQuery(name = "User.findByUserId", query = "select u from User u where u.userId = :userId"),
        @NamedQuery(name = "User.findByEmail", query = "select u from User u where u.email = :email")
})
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 8876647670961537322L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String email;
    private String password;
    private String accountType;

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}
