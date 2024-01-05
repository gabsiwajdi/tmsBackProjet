package com.Tmsreview.tms.Models.TMS;


import javax.persistence.*;

@Entity
@Table(name = "Carburant")
public class Carburant {

    @Id
    @Column(name = "idCarburant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCarburant;

    @Column(unique= true)
    String name;

    @Column(name = "prixCarburant")
    Float prixCarburant;

    public Carburant() {}


    public Carburant(String name, Float prixCarburant) {
        this.name = name;
        this.prixCarburant = prixCarburant;
    }

    public Long getIdCarburant() {
        return idCarburant;
    }

    public void setIdCarburant(Long idCarburant) {
        this.idCarburant = idCarburant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrixCarburant() {
        return prixCarburant;
    }

    public void setPrixCarburant(Float prixCarburant) {
        this.prixCarburant = prixCarburant;
    }
}

