package pl.rybak.unknown.domain.test;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by roophie on 21.06.2017.
 */
@Entity
@Table(name = "up_test")
@PersistenceUnit(unitName = "unnamedPU")
@PersistenceContext(unitName = "unnamedPU")
public class TestEntity implements Serializable{

    @Id
    private Long id;

    @Column(name = "nazwa")
    private String nazwa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
