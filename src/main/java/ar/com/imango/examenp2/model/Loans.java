package ar.com.imango.examenp2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "loans")
public class Loans implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "total")
    private Double total;

    @Column(name = "user_id")
    private int user;

    public Loans() {
    }

    public Loans(Double total, int user) {
        this.total = total;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getUserId() {
        return user;
    }

    public void setUserId(int userId) {
        this.user = userId;
    }
}
