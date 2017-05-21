package com.aan.app.fx.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lainc aancakepbro on 5/21/2017.
 */

@Entity
@Table(name = "m_anggota")
public class Anggota {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column
    private String name;

    @Column
    private Date registrationDate;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anggota", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Pinjam> daftarPinjam= new ArrayList<>();


    public List<Pinjam> getDaftarPinjam() {
        return daftarPinjam;
    }

    public void setDaftarPinjam(List<Pinjam> daftarPinjam) {
        this.daftarPinjam = daftarPinjam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
