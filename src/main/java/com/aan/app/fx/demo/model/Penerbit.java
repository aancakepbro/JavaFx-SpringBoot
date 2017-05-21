package com.aan.app.fx.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lainc aancakepbro on 5/21/2017.
 */

@Entity
@Table(name = "m_penerbit")
public class Penerbit {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    @Column(name = "website")
    private String web;

    @OneToMany(mappedBy = "penerbit", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Buku> bukus = new ArrayList<>();

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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public List<Buku> getBukus() {
        return bukus;
    }

    public void setBukus(List<Buku> bukus) {
        this.bukus = bukus;
    }
}
