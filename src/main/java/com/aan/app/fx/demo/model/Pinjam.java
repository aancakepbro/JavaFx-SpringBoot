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
@Table(name = "m_pinjam")
public class Pinjam {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(name = "tgl_pinjam")
    private Date tglPinjam;

    @Column(name = "tgl_kembali")
    private Date tglKembali;

    @JoinColumn(name = "anggota_kode", nullable = false)
    @OneToOne
    private Anggota anggota;

    @JoinColumn(name = "buku_kode", nullable = false)
    @OneToOne
    private Buku buku;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
}
